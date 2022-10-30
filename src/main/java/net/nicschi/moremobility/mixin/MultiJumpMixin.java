package net.nicschi.moremobility.mixin;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.nicschi.moremobility.enchantments.ModEnchantments;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(ClientPlayerEntity.class)
public class MultiJumpMixin {

    @Shadow
    @Final
    protected MinecraftClient client;
    private int jumpCount = 0;
    private boolean playerJumpedOnLastTick = false;

    @Inject(method = "tickMovement", at = @At("HEAD"))
    private void tickMovement(CallbackInfo info) {
        ClientPlayerEntity player = this.client.player;
        double velocityDeviation = 0.15;
        assert player != null;

        if (player.isOnGround() || player.isClimbing() || player.isSwimming() || player.isTouchingWater()) {
            this.jumpCount = EnchantmentHelper.getEquipmentLevel(ModEnchantments.MULTI_JUMP, player);
        } else if (this.jumpCount > 0 && player.input.jumping && player.getVelocity().y < velocityDeviation && !playerJumpedOnLastTick) {
            player.jump();
            this.jumpCount--;

            player.playSound(SoundEvents.ENTITY_GOAT_LONG_JUMP, SoundCategory.PLAYERS, 0.3f, 1);
        }

        this.playerJumpedOnLastTick = player.input.jumping;
    }

}


package net.mcreator.exnihilonatureminerals.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.exnihilonatureminerals.ExnihilonaturemineralsModElements;

@ExnihilonaturemineralsModElements.ModElement.Tag
public class PieceUvaroriteItem extends ExnihilonaturemineralsModElements.ModElement {
	@ObjectHolder("exnihilonatureminerals:piece_uvarovite")
	public static final Item block = null;

	public PieceUvaroriteItem(ExnihilonaturemineralsModElements instance) {
		super(instance, 10);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}

	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MISC).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("piece_uvarovite");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}

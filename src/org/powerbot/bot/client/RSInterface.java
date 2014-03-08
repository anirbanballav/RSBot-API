package org.powerbot.bot.client;

public interface RSInterface {
	public String getTooltip();

	public int getComponentID();

	public int getZRotation();

	public int getWidth();

	public int getXRotation();

	public int getModelType();

	public int getTextureID();

	public RSInterface[] getComponents();

	public String getComponentName();

	public int getX();

	public int getHorizontalScrollbarPosition();

	public int getSpecialType();

	public int getY();

	public int getParentID();

	public String getText();

	public int getVerticalScrollbarThumbSize();

	public int getComponentStackSize();

	public int getVerticalScrollbarPosition();

	public String[] getActions();

	public int getVerticalScrollbarSize();

	public int getComponentIndex();

	public int getType();

	public int getModelID();

	public int getModelZoom();

	public String getSelectedActionName();

	public int getHorizontalScrollbarSize();

	public int getHorizontalScrollbarThumbSize();

	public boolean isVerticallyFlipped();

	public int getTextColor();

	public int getYRotation();

	public int getBoundsArrayIndex();

	public int getShadowColor();

	public boolean isHorizontallyFlipped();

	public boolean isHidden();

	public boolean isInventoryInterface();

	public int getHeight();

	public int getID();

	public boolean isVisible();

	public int getBorderThinkness();
}
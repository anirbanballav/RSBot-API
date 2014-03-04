package org.powerbot.script.rs3.tools;

public class ChatOption extends ClientAccessor implements Textable, Validatable {
	private final int index;
	private final Component option;

	public ChatOption(final ClientContext ctx, final int index, final Component option) {
		super(ctx);
		this.index = index;
		this.option = option;
	}

	public int getIndex() {
		return index;
	}

	@Override
	public String getText() {
		if (option == null) {
			return "";
		}
		return option.getText();
	}

	public boolean select() {
		return select(false);
	}

	public boolean select(final boolean key) {
		if (!isValid()) {
			return false;
		}
		if (key) {
			return ctx.keyboard.send(Integer.toString(index + 1));
		}
		return option.click();
	}

	@Override
	public boolean isValid() {
		return index >= 0 && index < 5 && option != null && option.isValid();
	}
}
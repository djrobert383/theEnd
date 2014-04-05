package nxt;

import javax.microedition.lcdui.Image;

public enum Icons {
	error(35, 35, new byte[] { (byte) 0x00, (byte) 0x00, (byte) 0x80,
			(byte) 0xc0, (byte) 0xe0, (byte) 0xf0, (byte) 0x78, (byte) 0xbc,
			(byte) 0xde, (byte) 0xee, (byte) 0xf7, (byte) 0xf7, (byte) 0xfb,
			(byte) 0xfb, (byte) 0xfb, (byte) 0xfb, (byte) 0xfb, (byte) 0xfb,
			(byte) 0xfb, (byte) 0xfb, (byte) 0xfb, (byte) 0xfb, (byte) 0xfb,
			(byte) 0xfb, (byte) 0xf7, (byte) 0xef, (byte) 0xce, (byte) 0x9c,
			(byte) 0x38, (byte) 0x70, (byte) 0xe0, (byte) 0xc0, (byte) 0x80,
			(byte) 0x00, (byte) 0x00, (byte) 0xfc, (byte) 0xff, (byte) 0x07,
			(byte) 0x03, (byte) 0xfd, (byte) 0xfe, (byte) 0xff, (byte) 0xff,
			(byte) 0xff, (byte) 0xff, (byte) 0xcf, (byte) 0x87, (byte) 0x03,
			(byte) 0x03, (byte) 0x07, (byte) 0x0f, (byte) 0x1f, (byte) 0x3f,
			(byte) 0x3f, (byte) 0x1f, (byte) 0x0f, (byte) 0x07, (byte) 0x03,
			(byte) 0x03, (byte) 0x87, (byte) 0xcf, (byte) 0xff, (byte) 0xff,
			(byte) 0xff, (byte) 0xfe, (byte) 0xfc, (byte) 0xf9, (byte) 0x03,
			(byte) 0xff, (byte) 0xfe, (byte) 0xff, (byte) 0xff, (byte) 0x00,
			(byte) 0x00, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
			(byte) 0xff, (byte) 0xff, (byte) 0x3f, (byte) 0x1f, (byte) 0x0f,
			(byte) 0x06, (byte) 0x00, (byte) 0x00, (byte) 0x80, (byte) 0xc0,
			(byte) 0xc0, (byte) 0x80, (byte) 0x00, (byte) 0x00, (byte) 0x06,
			(byte) 0x0f, (byte) 0x1f, (byte) 0x3f, (byte) 0x7f, (byte) 0xff,
			(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x00,
			(byte) 0xff, (byte) 0xff, (byte) 0x03, (byte) 0x07, (byte) 0x0f,
			(byte) 0x1e, (byte) 0x3d, (byte) 0x7b, (byte) 0xf7, (byte) 0xef,
			(byte) 0xdf, (byte) 0xbf, (byte) 0x7f, (byte) 0x7e, (byte) 0xfc,
			(byte) 0xfc, (byte) 0xfe, (byte) 0xff, (byte) 0xff, (byte) 0xff,
			(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfe, (byte) 0xfc,
			(byte) 0xfc, (byte) 0x7c, (byte) 0x3e, (byte) 0x9f, (byte) 0xcf,
			(byte) 0xe7, (byte) 0x73, (byte) 0x39, (byte) 0x1c, (byte) 0x0e,
			(byte) 0x07, (byte) 0x03, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01,
			(byte) 0x03, (byte) 0x03, (byte) 0x03, (byte) 0x06, (byte) 0x06,
			(byte) 0x06, (byte) 0x06, (byte) 0x06, (byte) 0x06, (byte) 0x06,
			(byte) 0x06, (byte) 0x06, (byte) 0x06, (byte) 0x06, (byte) 0x06,
			(byte) 0x06, (byte) 0x02, (byte) 0x03, (byte) 0x03, (byte) 0x01,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, }),

	ok(35, 35, new byte[] { (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x80,
			(byte) 0xc0, (byte) 0x60, (byte) 0xb0, (byte) 0xd8, (byte) 0xcc,
			(byte) 0xec, (byte) 0xf6, (byte) 0xf6, (byte) 0xfe, (byte) 0xfb,
			(byte) 0xfb, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
			(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfe,
			(byte) 0xfe, (byte) 0xfc, (byte) 0xfc, (byte) 0xf8, (byte) 0xf0,
			(byte) 0xf0, (byte) 0xe0, (byte) 0x80, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0xe0, (byte) 0xfc, (byte) 0xff, (byte) 0xff,
			(byte) 0xfd, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x7f,
			(byte) 0x7f, (byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff,
			(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
			(byte) 0x7f, (byte) 0x3f, (byte) 0x1f, (byte) 0x0f, (byte) 0x07,
			(byte) 0x03, (byte) 0x01, (byte) 0x83, (byte) 0xc7, (byte) 0xef,
			(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfc,
			(byte) 0xf0, (byte) 0x7f, (byte) 0xff, (byte) 0xff, (byte) 0xff,
			(byte) 0xff, (byte) 0xff, (byte) 0xfd, (byte) 0xf9, (byte) 0xf0,
			(byte) 0xe0, (byte) 0xc0, (byte) 0x80, (byte) 0x01, (byte) 0x03,
			(byte) 0x07, (byte) 0x07, (byte) 0x03, (byte) 0x01, (byte) 0x80,
			(byte) 0xc0, (byte) 0xe0, (byte) 0xf0, (byte) 0xf8, (byte) 0xfc,
			(byte) 0xfe, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
			(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
			(byte) 0x7f, (byte) 0x00, (byte) 0x01, (byte) 0x07, (byte) 0x0f,
			(byte) 0x3f, (byte) 0x7f, (byte) 0x7f, (byte) 0xff, (byte) 0xff,
			(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xfe,
			(byte) 0xfc, (byte) 0xfc, (byte) 0xfe, (byte) 0xff, (byte) 0xff,
			(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff,
			(byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0xff, (byte) 0x7f,
			(byte) 0x7f, (byte) 0x3f, (byte) 0x0f, (byte) 0x07, (byte) 0x01,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x01,
			(byte) 0x01, (byte) 0x03, (byte) 0x03, (byte) 0x07, (byte) 0x07,
			(byte) 0x07, (byte) 0x07, (byte) 0x07, (byte) 0x07, (byte) 0x07,
			(byte) 0x07, (byte) 0x07, (byte) 0x07, (byte) 0x07, (byte) 0x03,
			(byte) 0x03, (byte) 0x01, (byte) 0x01, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00, (byte) 0x00,
			(byte) 0x00, });

	private final Image icon;
	private final int width, height;

	Icons(int width, int height, byte[] image) {
		this.width = width;
		this.height = height;
		icon = new Image(width, height, image);
	}

	int getHeight() {
		return height;
	}

	int getWidth() {
		return width;
	}

	Image getIcon() {
		return icon;
	}
}

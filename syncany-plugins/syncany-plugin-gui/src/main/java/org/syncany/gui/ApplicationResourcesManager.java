/*
 * Syncany, www.syncany.org
 * Copyright (C) 2011-2013 Philipp C. Heckel <philipp.heckel@gmail.com> 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.syncany.gui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Font;
import org.syncany.util.EnvironmentUtil;

/**
 * @author Vincent Wiencek <vwiencek@gmail.com>
 *
 */
public class ApplicationResourcesManager {
	public static int DEFAULT_BUTTON_WIDTH = 90;
	public static int DEFAULT_BUTTON_HEIGHT = 30;

	public static String FONT_NAME = "Lucida Grande";
	public static int FONT_SIZE = EnvironmentUtil.isMacOS() ? 12 : 10;
	
	public static Font FONT_NORMAL = SWTResourceManager.getFont(FONT_NAME, FONT_SIZE, SWT.NORMAL);
	public static Font FONT_BOLD = SWTResourceManager.getFont(FONT_NAME, FONT_SIZE, SWT.BOLD);
}

/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portalweb.portlet.breadcrumb.portlet.viewportletbreadcrumb;

import com.liferay.portalweb.portal.BaseTestCase;
import com.liferay.portalweb.portal.util.RuntimeVariables;

/**
 * @author Brian Wing Shun Chan
 */
public class AddPortletBreadcrumbChildPageTest extends BaseTestCase {
	public void testAddPortletBreadcrumbChildPage() throws Exception {
		selenium.selectWindow("null");
		selenium.selectFrame("relative=top");
		selenium.open("/web/guest/home/");
		selenium.waitForVisible("link=Breadcrumb Test Page");
		selenium.clickAt("link=Breadcrumb Test Page",
			RuntimeVariables.replace("Breadcrumb Test Page"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("link=Child Test Page",
			RuntimeVariables.replace("Child Test Page"));
		selenium.waitForPageToLoad("30000");
		selenium.clickAt("//div[@id='dockbar']",
			RuntimeVariables.replace("Dockbar"));
		selenium.waitForElementPresent(
			"//script[contains(@src,'/aui/aui-editable/aui-editable-min.js')]");
		assertEquals(RuntimeVariables.replace("Add"),
			selenium.getText("//li[@id='_145_addContent']/a/span"));
		selenium.mouseOver("//li[@id='_145_addContent']/a/span");
		selenium.waitForVisible("//a[@id='_145_addApplication']");
		assertTrue(selenium.isPartialText("//a[@id='_145_addApplication']",
				"More"));
		selenium.clickAt("//a[@id='_145_addApplication']",
			RuntimeVariables.replace("More"));
		selenium.waitForElementPresent(
			"//script[contains(@src,'/aui/aui-live-search/aui-live-search-min.js')]");
		selenium.waitForVisible("//input[@id='layout_configuration_content']");
		selenium.type("//input[@id='layout_configuration_content']",
			RuntimeVariables.replace("b"));
		selenium.keyDown("//input[@id='layout_configuration_content']",
			RuntimeVariables.replace("\\13"));
		selenium.keyUp("//input[@id='layout_configuration_content']",
			RuntimeVariables.replace("\\13"));
		selenium.waitForVisible("//div[@title='Breadcrumb']/p/a");
		selenium.clickAt("//div[@title='Breadcrumb']/p/a",
			RuntimeVariables.replace("Add"));
		selenium.waitForVisible("//section");
		assertTrue(selenium.isVisible("//section"));
		assertEquals(RuntimeVariables.replace("Liferay"),
			selenium.getText(
				"//div/ul[@class='breadcrumbs breadcrumbs-horizontal lfr-component']/li[1]/span/a"));
		assertEquals(RuntimeVariables.replace("Breadcrumb Test Page"),
			selenium.getText(
				"//div/ul[@class='breadcrumbs breadcrumbs-horizontal lfr-component']/li[2]/span/a"));
		assertEquals(RuntimeVariables.replace("Child Test Page"),
			selenium.getText(
				"//div/ul[@class='breadcrumbs breadcrumbs-horizontal lfr-component']/li[3]/span/a"));
	}
}
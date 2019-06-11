package com.caforerof.calcweb.spring.layouts;

import com.caforerof.calcweb.spring.MessageBean;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.AppLayoutMenu;
import com.vaadin.flow.component.applayout.AppLayoutMenuItem;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.textfield.TextField;

public class LayoutTemplate {
	
	public AppLayout templateHeader() {
		AppLayout appLayout = new AppLayout();
		AppLayoutMenu menu = appLayout.createMenu();
		Image img = new Image("https://i.imgur.com/GPpnszs.png", "Vaadin Logo");
		img.setHeight("44px");
		appLayout.setBranding(img);

		menu.addMenuItems(new AppLayoutMenuItem("Home", ""),
						  new AppLayoutMenuItem("Obtener Sesion", "getSession"),
						  new AppLayoutMenuItem("Añadir Operando", "setOperand"),
						  new AppLayoutMenuItem("Ejecutar Operación", "setOperator"));
		return appLayout;
	}
	
}

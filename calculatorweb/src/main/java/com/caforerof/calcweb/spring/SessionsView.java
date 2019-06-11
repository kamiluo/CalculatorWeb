package com.caforerof.calcweb.spring;

import com.caforerof.calcweb.spring.layouts.LayoutTemplate;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.AppLayoutMenu;
import com.vaadin.flow.component.applayout.AppLayoutMenuItem;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("getSession") 
public class SessionsView extends VerticalLayout {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SessionsView(@Autowired MessageBean bean) {
		LayoutTemplate template = new LayoutTemplate();
		AppLayout appLayout = template.templateHeader();
     // label will only take the space it needs
        VerticalLayout layout = new VerticalLayout();
        Label label = new Label("SessionID: ");
        Button button = new Button("Generar Id",
                e -> label.setText("SessionID: " + String.valueOf(bean.getSession())));
        layout.add(button, label);
    	appLayout.setContent(layout);
        add(appLayout);
    }

}

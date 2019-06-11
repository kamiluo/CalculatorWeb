package com.caforerof.calcweb.spring;

import com.caforerof.calcweb.spring.layouts.LayoutTemplate;
import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.AppLayoutMenu;
import com.vaadin.flow.component.applayout.AppLayoutMenuItem;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.formlayout.FormLayout.ResponsiveStep;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.notification.Notification;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("setOperand") 
public class OperandsView extends VerticalLayout {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public OperandsView(@Autowired MessageBean bean) {
		LayoutTemplate template = new LayoutTemplate();
		AppLayout appLayout = template.templateHeader();
        FormLayout nameLayout = new FormLayout();
        TextField idField = new TextField();
        idField.setLabel("Id");
        idField.setPlaceholder("id");
        TextField operandField = new TextField();
        operandField.setLabel("Operando");
        operandField.setPlaceholder("operando");
        
        Button button = new Button("Añadir Operador",
                e -> Notification.show(bean.setOperand(Double.parseDouble(operandField.getValue()), Long.parseLong(idField.getValue()))));

        nameLayout.add(idField, operandField, button);

        nameLayout.setResponsiveSteps(
                new ResponsiveStep("0", 1),
                new ResponsiveStep("21em", 2),
                new ResponsiveStep("22em", 3));
    	appLayout.setContent(nameLayout);
        add(appLayout);
    }

}

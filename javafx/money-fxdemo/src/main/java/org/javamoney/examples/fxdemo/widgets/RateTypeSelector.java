package org.javamoney.examples.fxdemo.widgets;

import java.util.Collection;

import javax.money.convert.MonetaryConversions;

import javafx.scene.control.ChoiceBox;

@SuppressWarnings("restriction")
public class RateTypeSelector extends ChoiceBox<String> {

	public RateTypeSelector() {
		final Collection<String> types = MonetaryConversions.getConversionProviderNames();
	}

}

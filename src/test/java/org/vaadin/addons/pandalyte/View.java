package org.vaadin.addons.pandalyte;

import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route("")
public class View extends VerticalLayout {

    public View() {
        add(new H1("Testing Voice Recognition Component"));
        VoiceRecognition voiceRecognition = new VoiceRecognition();
        Div resultLayout = new Div();
        add(voiceRecognition, new Label("Result:"), resultLayout);

        voiceRecognition.addResultListener(listener -> {
            resultLayout.setText(listener.getSpeech());
        });

        
        add(new H1("End Testing Voice Recognition Component"));

    }
}

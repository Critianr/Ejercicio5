package views;

import javax.swing.JList;
import javax.swing.JPanel;
import java.awt.*;

public class PanelLista extends JPanel {

    private JList<String> listaReq;

    private index vistaFormulario;

    public PanelLista(index i) {
        super();
        setLayout(new GridLayout());
        vistaFormulario = i;

        listaReq = new JList<>();

        add(listaReq);
    }

    public void updateLista(String[] listado) {
        listaReq.setListData(listado);
    }

}
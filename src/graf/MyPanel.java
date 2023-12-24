package graf;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.util.*;

public class MyPanel extends JPanel {
    JTextField modelTF, numberTF, ownerTF, sortTF, popTF;

    Autopark park;

    JButton addButton, popButton, sortButton, printButton, findButton;

    MyPanel() {
        JPanel panel = new JPanel();
        park = new Autopark();

        addButton = new JButton("add");
        add(addButton);

        modelTF = new JTextField("model");
        modelTF.setColumns(20);
        add(modelTF);

        numberTF = new JTextField("number");
        numberTF.setColumns(20);
        add(numberTF);

        ownerTF = new JTextField("owner");
        ownerTF.setColumns(20);
        add(ownerTF);

        popButton = new JButton("pop");
        add(popButton);

        popTF = new JTextField("number");
        popTF.setColumns(10);
        add(popTF);

        sortButton = new JButton("sort");
        add(sortButton);

        sortTF = new JTextField("key");
        sortTF.setColumns(20);
        add(sortTF);

        printButton = new JButton("Print");
        add(printButton);

        JTextArea printArea = new JTextArea();
        printArea.setColumns(20);
        add(printArea);

        findButton = new JButton("find");
        add(findButton);

        JTextArea findArea = new JTextArea("number");
        findArea.setColumns(20);
        add(findArea);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String model = modelTF.getText();
                String number = numberTF.getText();
                String owner = ownerTF.getText();

                park.Add(new CarInformation(number, model, owner));

                park.Print();
            }
        });

        sortButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String key = sortTF.getText();

                park.sortByField(key);
            }
        });

        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text = "";
                for(var i : park.cars) {
                    text += i.toString();
                }
                printArea.setText(text);
            }
        });

        findButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                var car = park.findByNumber(findArea.getText());
                if (car == null)
                    findArea.setText("no such car");
                else
                    findArea.setText(car.toString());
            }
        });

        popButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                park.RemoveByNumber(popTF.getText());
            }
        });
    }
}

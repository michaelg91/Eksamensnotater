JButton button = new JButton("Trykk her");
JLabel label = new JLabel("Skriv inn noe");

// bruker skriver tekst, getText() returnerer dette.
JTextField text = new JTextField(30); 
JTextArea window = new JTextArea(10, 30);

// Lager rullevindu ut av window (TextArea).
JScrollPane scroll = new JScrollPane(window); 

// Et panel inneholder andre komponenter.
JPanel panel = new JPanel();

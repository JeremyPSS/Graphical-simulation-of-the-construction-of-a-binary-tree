package Vista;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Toolkit;

import javax.swing.JInternalFrame;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;

import arbolBinario.NodoArbol;
import arbolBinarioGrafico.ArbolGrafico;


import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 * JFrame interfaz grafica del proyecto y para la creacion del arbol binario
 * @author Grupo10
 * @version 3.0
 * @date 12/09/2021
 */
public class Vistaa extends javax.swing.JFrame {
 
    /**
     * Creates new form Vista
     */
    public Vistaa() {
    	getContentPane().setBackground(new Color(152, 251, 152));
        initComponents();
        this.inicializar(false);
        setLocationRelativeTo(this);
        simulador.setNombre("AB de numeros enteros"); 
    }
    
    /*
     * Variables para la clase
     */
    private Integer dato; 
    private ArbolGrafico<Integer> simulador = new ArbolGrafico<>(); 
    private ArbolGrafico<Integer> aux = new ArbolGrafico<>(); 
    private boolean contador=false;
    private NodoArbol<Integer> raiz; 
    
    /**
     * Actualiza los recorridos del arbol
     * @param enable
     */
    private void inicializar(boolean enable) {
        this.buttonInformacion.setEnabled(enable);
        this.buttonNuevo.setEnabled(enable);
        this.buttonEliminar.setEnabled(enable);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        impresion = new javax.swing.JTextArea();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jInternalFrame2 = new javax.swing.JInternalFrame();
        botonInsertar = new javax.swing.JButton();
        buttonInformacion = new javax.swing.JButton();
        buttonEliminar = new javax.swing.JButton();
        buttonNuevo = new javax.swing.JButton();
        txtdato = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Panel de Pruebas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 10))); // NOI18N
        jPanel2.setOpaque(false);

        jScrollPane1.setOpaque(false);

        impresion.setEditable(false);
        impresion.setColumns(20);
        impresion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        impresion.setRows(5);
        impresion.setBorder(javax.swing.BorderFactory.createTitledBorder("Resultados de operaciones"));
        impresion.setOpaque(false);
        jScrollPane1.setViewportView(impresion);

        jDesktopPane1.setOpaque(false);

        jInternalFrame2.setIconifiable(true);
        jInternalFrame2.setMaximizable(true);
        jInternalFrame2.setResizable(true);
        jInternalFrame2.setEnabled(false);
        jInternalFrame2.setFocusCycleRoot(false);
        jInternalFrame2.setVisible(true);

        javax.swing.GroupLayout jInternalFrame2Layout = new javax.swing.GroupLayout(jInternalFrame2.getContentPane());
        jInternalFrame2.getContentPane().setLayout(jInternalFrame2Layout);
        jInternalFrame2Layout.setHorizontalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
        );
        jInternalFrame2Layout.setVerticalGroup(
            jInternalFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 290, Short.MAX_VALUE)
        );

        jDesktopPane1.add(jInternalFrame2);
        jInternalFrame2.setBounds(10, 10, 600, 320);

        botonInsertar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botonInsertar.setText("Insertar");
        botonInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonInsertarActionPerformed(evt);
            }
        });

        buttonInformacion.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        buttonInformacion.setText("Informacion");
        buttonInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InOrdenActionPerformed(evt);
            }
        });

        buttonEliminar.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        buttonEliminar.setText("Eliminar");
        buttonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PreOrdenActionPerformed(evt);
            }
        });

        buttonNuevo.setFont(new java.awt.Font("Tahoma", 3, 11)); // NOI18N
        buttonNuevo.setText("Nuevo");
        buttonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PostOrdenActionPerformed(evt);
            }
        });
        
        JButton btnNewButton = new JButton("Cerrar");
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		dispose();
        		
        	}
        });
        
        btnAcercaDe = new JButton("Acerca de");
        btnAcercaDe.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		String info = "Institucion: Universidad Tecnica de Machala"+  "\nCarrera Ingenieria en Tecnologias de la Informacion"+
       				 "\nAsignatura: Estructura de datos" + "\nEste simulador fue hecho como proyecto de la curso"+"\n Realizado por el grupo #10";
        		impresion.setText(info);
        		
        	}
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2Layout.setHorizontalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jDesktopPane1, GroupLayout.PREFERRED_SIZE, 616, GroupLayout.PREFERRED_SIZE)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addComponent(txtdato, GroupLayout.PREFERRED_SIZE, 162, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED))
        						.addGroup(jPanel2Layout.createSequentialGroup()
        							.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
        								.addComponent(btnNewButton, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        								.addGroup(jPanel2Layout.createSequentialGroup()
        									.addComponent(buttonInformacion, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
        									.addGap(4)
        									.addComponent(buttonEliminar)))
        							.addGap(4)))
        					.addGap(19)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING, false)
        						.addComponent(btnAcercaDe, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(botonInsertar, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        						.addComponent(buttonNuevo, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        					.addGap(18)
        					.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 325, GroupLayout.PREFERRED_SIZE)))
        			.addContainerGap(10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
        	jPanel2Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel2Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jDesktopPane1, GroupLayout.PREFERRED_SIZE, 332, GroupLayout.PREFERRED_SIZE)
        			.addGroup(jPanel2Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addGap(11)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(botonInsertar, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
        						.addComponent(txtdato, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        					.addGap(10)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(buttonInformacion, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        						.addComponent(buttonEliminar, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
        						.addComponent(buttonNuevo, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel2Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnNewButton)
        						.addComponent(btnAcercaDe)))
        				.addGroup(jPanel2Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        jPanel2.setLayout(jPanel2Layout);
        
        JLabel lblNewLabel = new JLabel("Jeremy Prieto - Angel Camacho - Luis Alvarado - Andres Cada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(lblNewLabel)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(10)
        					.addComponent(jPanel2, GroupLayout.DEFAULT_SIZE, 634, Short.MAX_VALUE)))
        			.addContainerGap())
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        			.addComponent(jPanel2, GroupLayout.PREFERRED_SIZE, 492, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(lblNewLabel))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    /**
     * Boton para insertar los datos del arbol como lo son la raiz y los hijos
     * @param evt
     */
    private void botonInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonInsertarActionPerformed     
    	//INGRESO DE LA RAIZ
    	if(contador==false) {

    		dato = Integer.parseInt(txtdato.getText());
    		this.simulador.insertarIZQ(dato);
			complementos();
			contador = true;
			txtdato.setText("");
			return;
    	}
        	 	
    	//INGRESO DE LOS NODOS HIJOS
    	try {
    		Integer lado = 0;
    		Integer dato = Integer.parseInt(txtdato.getText());
    		this.simulador.insertarIZQ(dato);
    		this.inicializar(true);
    		complementos();
    		txtdato.setText("");
    	}catch (Exception e) {
    		JOptionPane.showMessageDialog(null, "No se pudo insertar el dato", "Intenta de nuevo...", 0);

    	} 
    		
               
    }//GEN-LAST:event_botonInsertarActionPerformed

    /**
     * Muestra el recorrido InOrder del arbol
     * @param evt
     */
    private void InOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InOrdenActionPerformed
    	String recorrido = simulador.Informacion();
    	this.impresion.setText("");
    	this.impresion.setText(recorrido);
    }//GEN-LAST:event_InOrdenActionPerformed

    /**
     * Muestra el recorrido PreOrden del arbol
     * @param evt
     */
    private void PreOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PreOrdenActionPerformed
    	try {
    	Integer dato =Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el dato a eliminar") );
    	this.simulador.eliminar(dato);
    	this.inicializar(true);
    	complementos();   		
    	}catch(Exception e) {
    		JOptionPane.showMessageDialog(null, "Ingrese numeros enteros");
    	}

    }//GEN-LAST:event_PreOrdenActionPerformed

    /**
     * Muestra el recorrido PostOrden del arbol
     * @param evt
     */
    private void PostOrdenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PostOrdenActionPerformed
    	Vistaa frm = new Vistaa();
    	frm.setVisible(true);
    	this.dispose();
    }//GEN-LAST:event_PostOrdenActionPerformed

    /**
     * Incializa los componentes principales para el dibujo del arbol
     */
    public void complementos(){
        this.repintarArbol();
    }
    
    /**
     * Dibujar el arbol
     */
    private void repintarArbol() {
        this.jDesktopPane1.removeAll();
        Rectangle tama�o = this.jInternalFrame2.getBounds();
        this.jInternalFrame2 = null;
        this.jInternalFrame2 = new JInternalFrame("Simulaci�n gr�fica de la construcci�n de un �rbol binario", true);
        this.jDesktopPane1.add(this.jInternalFrame2, JLayeredPane.DEFAULT_LAYER);
        this.jInternalFrame2.setVisible(true);
        this.jInternalFrame2.setBounds(tama�o);
        this.jInternalFrame2.setEnabled(false);
        this.jInternalFrame2.getContentPane().add(this.simulador.getdibujo(), BorderLayout.CENTER);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vistaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vistaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vistaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vistaa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vistaa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonInformacion;
    private javax.swing.JButton buttonNuevo;
    private javax.swing.JButton buttonEliminar;
    private javax.swing.JButton botonInsertar;
    private javax.swing.JTextArea impresion;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JInternalFrame jInternalFrame2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtdato;
    private JButton btnAcercaDe;
}

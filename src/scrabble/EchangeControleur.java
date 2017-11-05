// Package
package scrabble;

// Imports
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.fxml.FXML;

/**
 * ***********************************************************************
 * Nom ...........: EchangeControleur.java
 * Description ...: Controleur de la scene permettant les echanges de tuiles
 * ...............: entre le sac et le chevalet du joueur
 * ...............:
 * Auteur(s) .....: SIMON BACQUET
 * Version .......: 1.0
 * Copyright .....: © 2017 SIMON BACQUET ALL RIGHTS RESERVED
 ***********************************************************************
 */
public class EchangeControleur extends Jeu {

	// Nom du bouton permettant de fermer la fenetre
	@FXML private Button btnFermeture;
	
	// Nom des labels contenant le nombre d'occurences de chaque tuile
	@FXML private Label lblNbA;
	@FXML private Label lblNbB;
	@FXML private Label lblNbC;
	@FXML private Label lblNbD;
	@FXML private Label lblNbE;
	@FXML private Label lblNbF;
	@FXML private Label lblNbG;
	@FXML private Label lblNbH;
	@FXML private Label lblNbI;
	@FXML private Label lblNbJ;
	@FXML private Label lblNbK;
	@FXML private Label lblNbL;
	@FXML private Label lblNbM;
	@FXML private Label lblNbN;
	@FXML private Label lblNbO;
	@FXML private Label lblNbP;
	@FXML private Label lblNbQ;
	@FXML private Label lblNbR;
	@FXML private Label lblNbS;
	@FXML private Label lblNbT;
	@FXML private Label lblNbU;
	@FXML private Label lblNbV;
	@FXML private Label lblNbW;
	@FXML private Label lblNbX;
	@FXML private Label lblNbY;
	@FXML private Label lblNbZ;
	@FXML private Label lblNbJocker;
	
	/**
	 * Met la valeur du nombre d'occurences de chaque tuile dans les labels a l'initialisation de la fenetre
	 */
	public void initialize() {
		
		lblNbA.setText(String.valueOf(sac.getNombreTuiles(new Tuile('A', Lettre.A.valeur))));
		lblNbB.setText(String.valueOf(sac.getNombreTuiles(new Tuile('B', Lettre.B.valeur))));
		lblNbC.setText(String.valueOf(sac.getNombreTuiles(new Tuile('C', Lettre.C.valeur))));
		lblNbD.setText(String.valueOf(sac.getNombreTuiles(new Tuile('D', Lettre.D.valeur))));
		lblNbE.setText(String.valueOf(sac.getNombreTuiles(new Tuile('E', Lettre.E.valeur))));
		lblNbF.setText(String.valueOf(sac.getNombreTuiles(new Tuile('F', Lettre.F.valeur))));
		lblNbG.setText(String.valueOf(sac.getNombreTuiles(new Tuile('G', Lettre.G.valeur))));
		lblNbH.setText(String.valueOf(sac.getNombreTuiles(new Tuile('H', Lettre.H.valeur))));
		lblNbI.setText(String.valueOf(sac.getNombreTuiles(new Tuile('I', Lettre.I.valeur))));
		lblNbJ.setText(String.valueOf(sac.getNombreTuiles(new Tuile('J', Lettre.J.valeur))));
		lblNbK.setText(String.valueOf(sac.getNombreTuiles(new Tuile('K', Lettre.K.valeur))));
		lblNbL.setText(String.valueOf(sac.getNombreTuiles(new Tuile('L', Lettre.L.valeur))));
		lblNbM.setText(String.valueOf(sac.getNombreTuiles(new Tuile('M', Lettre.M.valeur))));
		lblNbN.setText(String.valueOf(sac.getNombreTuiles(new Tuile('N', Lettre.N.valeur))));
		lblNbO.setText(String.valueOf(sac.getNombreTuiles(new Tuile('O', Lettre.O.valeur))));
		lblNbP.setText(String.valueOf(sac.getNombreTuiles(new Tuile('P', Lettre.P.valeur))));
		lblNbQ.setText(String.valueOf(sac.getNombreTuiles(new Tuile('Q', Lettre.Q.valeur))));
		lblNbR.setText(String.valueOf(sac.getNombreTuiles(new Tuile('R', Lettre.R.valeur))));
		lblNbS.setText(String.valueOf(sac.getNombreTuiles(new Tuile('S', Lettre.S.valeur))));
		lblNbT.setText(String.valueOf(sac.getNombreTuiles(new Tuile('T', Lettre.T.valeur))));
		lblNbU.setText(String.valueOf(sac.getNombreTuiles(new Tuile('U', Lettre.U.valeur))));
		lblNbV.setText(String.valueOf(sac.getNombreTuiles(new Tuile('V', Lettre.V.valeur))));
		lblNbW.setText(String.valueOf(sac.getNombreTuiles(new Tuile('W', Lettre.W.valeur))));
		lblNbX.setText(String.valueOf(sac.getNombreTuiles(new Tuile('X', Lettre.X.valeur))));
		lblNbY.setText(String.valueOf(sac.getNombreTuiles(new Tuile('Y', Lettre.Y.valeur))));
		lblNbZ.setText(String.valueOf(sac.getNombreTuiles(new Tuile('Z', Lettre.Z.valeur))));
		lblNbJocker.setText(String.valueOf(sac.getNombreTuiles(new Tuile('*', Lettre.JOCKER.valeur))));
	}
	
	/**
	 * Ferme la fenetre d'echange
	 */
	@FXML public void fermerEchange() {
	
		// get a handle to the stage
	    Stage stage = (Stage) btnFermeture.getScene().getWindow();
	    // do what you have to do
	    stage.close();
	}
}

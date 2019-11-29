package com.example.demo;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.boot.SpringApplication;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ExcelWrite {

	// TODO Auto-generated method stub

	private static String[] columns = { "idEtudiant", "Architecture des Ordinateurs", "Techniques de Compilation",
			"Recherche Opérationnelle", "Développement Mobile", "Programmation Multimédias", "Statistiques",
			"Bases de Données Avancées", "Réseaux Informatiques", "Conception Orientée Objet",
			"Programmation Orientée Objet", "Conception des Bases de Données", "Système Logique", "Probabilités",
			"Algorithmique et Structures de Données", "Blockchain", "Architecture Logicielle",
			"Systèmes d'Exploitation", "Entrepreneuriat", "Analyse Numérique", "Math Pour L'ingénieur",
			"Opt 2 : Fouille de Données", "Opt 9 : Big Data", "Opt 10 : Developpement iOS",
			"Opt 3 : Machine Learning-Deep Learning", "Opt 6 : Business Intelligence",
			"Opt 4 : Transactions Electroniques", "Opt 1 : Cloud Computing", "Opt 8 : Sécurité Informatique",
			"Opt 5 : Réseaux IP", "Opt 16 : Réseaux GSM", "Opt 12 : Electronique Embarquée",
			"Opt 13 : Système Robotique", "Opt 14 : Conception des Cartes Electroniques",
			"Opt 15 : Réseau de Capteurs Sans Fils", "Opt 7 : Qualité et Test" };

	private static List<Etudiant> etudiants = new ArrayList<>();

	// Initializing Etudiant data to insert into the excel file
	static {
		for (int i = 1; i <= 10000; i++) {

			double ArchitecturedesOrdinateurs = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double TechniquesdeCompilation = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double RechercheOpérationnelle = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double DéveloppementMobile = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double ProgrammationMultimédias = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double Statistiques = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double BasesdeDonnéesAvancées = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double RéseauxInformatiques = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double ConceptionOrientéeObjet = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double ProgrammationOrientéeObjet = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double ConceptiondesBasesdeDonnées = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double SystèmeLogique = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double Probabilités = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double AlgorithmiqueetStructuresdeDonnées = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double Blockchain = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double ArchitectureLogicielle = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double SystèmesExploitation = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double Entrepreneuriat = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double AnalyseNumérique = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;
			double MathPouringénieur = (double) Math.round((Math.random() * (20 - 3)+3) * 100) / 100;

			/********** OPTION **************/
			double Opt2FouilleDonnées = 0;
			double Opt9BigData = 0;
			double Opt10DeveloppementiOS = 0;
			double Opt3MachineLearning = 0;
			double Opt6BusinessIntelligence = 0;
			double Opt4TransactionsElectroniques = 0;
			double Opt1CloudComputing = 0;
			double Opt8SécuritéInformatique = 0;
			double Opt5RéseauxIP = 0;
			double Opt16RéseauxGSM = 0;
			double Opt12ElectroniqueEmbarquée = 0;
			double Opt13SystèmeRobotique = 0;
			double Opt14ConceptionCartesElectroniques = 0;
			double Opt15RéseauCapteurs = 0;
			double Opt7QualitéTest = 0;

			double x = ((AlgorithmiqueetStructuresdeDonnées + DéveloppementMobile + ProgrammationMultimédias
					+ BasesdeDonnéesAvancées + ProgrammationOrientéeObjet + ConceptiondesBasesdeDonnées
					+ ArchitectureLogicielle + ConceptionOrientéeObjet) / 8);
			double y = ((ArchitecturedesOrdinateurs + TechniquesdeCompilation + RechercheOpérationnelle + SystèmeLogique
					+ Entrepreneuriat) / 5);
			double z = ((AnalyseNumérique + Probabilités + Statistiques + SystèmesExploitation + RéseauxInformatiques
					+ Blockchain + MathPouringénieur) / 7);

			double max = x;

			if (max < y) {
				max = y;
			}
			if (max < z) {
				max = z;
			}

			if (max == x) {
				Opt2FouilleDonnées = (double) Math.round(((Math.random() * (20 - 7)) + 7) * 100) / 100;
				Opt9BigData = (double) Math.round(((Math.random() * (20 - 7)) + 7) * 100) / 100;
				Opt10DeveloppementiOS = (double) Math.round(((Math.random() * (20 - 7)) + 7) * 100) / 100;
				Opt3MachineLearning = (double) Math.round(((Math.random() * (20 - 7)) + 7) * 100) / 100;
				Opt6BusinessIntelligence = (double) Math.round(((Math.random() * (20 - 7)) + 7) * 100) / 100;

				Opt4TransactionsElectroniques = -1;
				Opt1CloudComputing = -1;
				Opt8SécuritéInformatique = -1;
				Opt5RéseauxIP = -1;
				Opt16RéseauxGSM = -1;

				Opt12ElectroniqueEmbarquée = -1;
				Opt13SystèmeRobotique = -1;
				Opt14ConceptionCartesElectroniques = -1;
				Opt15RéseauCapteurs = -1;
				Opt7QualitéTest = -1;
			}

			else if (max == y) {

				Opt4TransactionsElectroniques = (double) Math.round(((Math.random() * (20 - 7)) + 7) * 100) / 100;
				Opt1CloudComputing = (double) Math.round(((Math.random() * (20 - 7)) + 7) * 100) / 100;
				Opt8SécuritéInformatique = (double) Math.round(((Math.random() * (20 - 7)) + 7) * 100) / 100;
				Opt5RéseauxIP = (double) Math.round(((Math.random() * (20 - 7)) + 7) * 100) / 100;
				Opt16RéseauxGSM = (double) Math.round(((Math.random() * (20 - 7)) + 7) * 100) / 100;

				Opt12ElectroniqueEmbarquée = -1;
				Opt13SystèmeRobotique = -1;
				Opt14ConceptionCartesElectroniques = -1;
				Opt15RéseauCapteurs = -1;
				Opt7QualitéTest = -1;

				Opt2FouilleDonnées = -1;
				Opt9BigData = -1;
				Opt10DeveloppementiOS = -1;
				Opt3MachineLearning = -1;
				Opt6BusinessIntelligence = -1;
			}

			else {

				Opt12ElectroniqueEmbarquée = (double) Math.round(((Math.random() * (20 - 7)) + 7) * 100) / 100;
				Opt13SystèmeRobotique = (double) Math.round(((Math.random() * (20 - 7)) + 7) * 100) / 100;
				Opt14ConceptionCartesElectroniques = (double) Math.round(((Math.random() * (20 - 7)) + 7) * 100) / 100;
				Opt15RéseauCapteurs = (double) Math.round(((Math.random() * (20 - 7)) + 7) * 100) / 100;
				Opt7QualitéTest = (double) Math.round(((Math.random() * (20 - 7)) + 7) * 100) / 100;

				Opt2FouilleDonnées = -1;
				Opt9BigData = -1;
				Opt10DeveloppementiOS = -1;
				Opt3MachineLearning = -1;
				Opt6BusinessIntelligence = -1;

				Opt4TransactionsElectroniques = -1;
				Opt1CloudComputing = -1;
				Opt8SécuritéInformatique = -1;
				Opt5RéseauxIP = -1;
				Opt16RéseauxGSM = -1;

			}

			etudiants.add(new Etudiant(i, ArchitecturedesOrdinateurs, TechniquesdeCompilation, RechercheOpérationnelle,
					DéveloppementMobile, ProgrammationMultimédias, Statistiques, BasesdeDonnéesAvancées,
					RéseauxInformatiques, ConceptionOrientéeObjet, ProgrammationOrientéeObjet,
					ConceptiondesBasesdeDonnées, SystèmeLogique, Probabilités, AlgorithmiqueetStructuresdeDonnées,
					Blockchain, ArchitectureLogicielle, SystèmesExploitation, Entrepreneuriat, AnalyseNumérique,
					MathPouringénieur, Opt2FouilleDonnées, Opt9BigData, Opt10DeveloppementiOS, Opt3MachineLearning,
					Opt6BusinessIntelligence, Opt4TransactionsElectroniques, Opt1CloudComputing,
					Opt8SécuritéInformatique, Opt5RéseauxIP, Opt16RéseauxGSM, Opt12ElectroniqueEmbarquée,
					Opt13SystèmeRobotique, Opt14ConceptionCartesElectroniques, Opt15RéseauCapteurs, Opt7QualitéTest));
		}

	}

	public static void main(String[] args) throws IOException, InvalidFormatException {

		SpringApplication.run(ExcelWrite.class, args);

		// Create a Workbook
		Workbook workbook = new XSSFWorkbook(); // new HSSFWorkbook() for generating `.xls` file

		/*
		 * CreationHelper helps us create instances of various things like DataFormat,
		 * Hyperlink, RichTextString etc, in a format (HSSF, XSSF) independent way
		 */
		CreationHelper createHelper = workbook.getCreationHelper();

		// Create a Sheet
		Sheet sheet = workbook.createSheet("Etudiant");

		/*
		 * // Create a Font for styling header cells Font headerFont =
		 * workbook.createFont(); headerFont.setBold(true);
		 * headerFont.setFontHeightInPoints((short) 14);
		 * headerFont.setColor(IndexedColors.RED.getIndex());
		 */

		/*
		 * // Create a CellStyle with the font CellStyle headerCellStyle =
		 * workbook.createCellStyle(); headerCellStyle.setFont(headerFont);
		 */

		// Create a Row
		Row headerRow = sheet.createRow(0);

		// Create cells
		for (int i = 0; i < columns.length; i++) {
			Cell cell = headerRow.createCell(i);
			cell.setCellValue(columns[i]);
			/* cell.setCellStyle(headerCellStyle); */
		}

		// Create Other rows and cells with employees data
		int rowNum = 1;
		for (Etudiant etudiant : etudiants) {
			Row row = sheet.createRow(rowNum++);

			row.createCell(0).setCellValue(etudiant.getIdEtudiant());
			row.createCell(1).setCellValue(etudiant.getArchitecturedesOrdinateurs());
			row.createCell(2).setCellValue(etudiant.getTechniquesdeCompilation());
			row.createCell(3).setCellValue(etudiant.getAlgorithmiqueetStructuresdeDonnées());
			row.createCell(4).setCellValue(etudiant.getRechercheOpérationnelle());
			row.createCell(5).setCellValue(etudiant.getDéveloppementMobile());
			row.createCell(6).setCellValue(etudiant.getProgrammationMultimédias());
			row.createCell(7).setCellValue(etudiant.getStatistiques());
			row.createCell(8).setCellValue(etudiant.getBasesdeDonnéesAvancées());
			row.createCell(9).setCellValue(etudiant.getRéseauxInformatiques());
			row.createCell(10).setCellValue(etudiant.getConceptionOrientéeObjet());
			row.createCell(11).setCellValue(etudiant.getSystèmeLogique());
			row.createCell(12).setCellValue(etudiant.getProbabilités());
			row.createCell(13).setCellValue(etudiant.getAlgorithmiqueetStructuresdeDonnées());
			row.createCell(14).setCellValue(etudiant.getBlockchain());
			row.createCell(15).setCellValue(etudiant.getArchitectureLogicielle());
			row.createCell(16).setCellValue(etudiant.getSystèmesExploitation());
			row.createCell(17).setCellValue(etudiant.getEntrepreneuriat());
			row.createCell(18).setCellValue(etudiant.getAnalyseNumérique());
			row.createCell(19).setCellValue(etudiant.getMathPouringénieur());
			row.createCell(20).setCellValue(etudiant.getConceptiondesBasesdeDonnées());
			row.createCell(21).setCellValue(etudiant.getOpt2FouilleDonnées());
			row.createCell(22).setCellValue(etudiant.getOpt9BigData());
			row.createCell(23).setCellValue(etudiant.getOpt10DeveloppementiOS());
			row.createCell(24).setCellValue(etudiant.getOpt3MachineLearning());
			row.createCell(25).setCellValue(etudiant.getOpt6BusinessIntelligence());
			row.createCell(26).setCellValue(etudiant.getOpt4TransactionsElectroniques());
			row.createCell(27).setCellValue(etudiant.getOpt1CloudComputing());
			row.createCell(28).setCellValue(etudiant.getOpt8SécuritéInformatique());
			row.createCell(29).setCellValue(etudiant.getOpt5RéseauxIP());
			row.createCell(30).setCellValue(etudiant.getOpt16RéseauxGSM());
			row.createCell(31).setCellValue(etudiant.getOpt12ElectroniqueEmbarquée());
			row.createCell(32).setCellValue(etudiant.getOpt13SystèmeRobotique());
			row.createCell(33).setCellValue(etudiant.getOpt14ConceptionCartesElectroniques());
			row.createCell(34).setCellValue(etudiant.getOpt15RéseauCapteurs());
			row.createCell(35).setCellValue(etudiant.getOpt7QualitéTest());
		}

		// Resize all columns to fit the content size
		for (int i = 0; i < columns.length; i++) {
			sheet.autoSizeColumn(i);
		}

		// Write the output to a file
		FileOutputStream fileOut = new FileOutputStream("C:/Users/M.Dhia/Desktop/EtudiantDataBase.xlsx");
		workbook.write(fileOut);
		fileOut.close();

		// Closing the workbook
		workbook.close();
	}

}

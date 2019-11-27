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

	private static String[] columns = { "idEtudiant", 
			"Architecture des Ordinateurs", 
			"Techniques de Compilation", 
			"Recherche Opérationnelle", 
			"Développement Mobile",
			"Programmation Multimédias",
			"Statistiques", 
			"Bases de Données Avancées", 
			"Réseaux Informatiques", 
			"Conception Orientée Objet", 
			"Programmation Orientée Objet", 
			"Conception des Bases de Données", 
			"Système Logique", 
			"Probabilités", 
			"Algorithmique et Structures de Données", 
			"Blockchain", 
			"Architecture Logicielle", 
			"Systèmes d'Exploitation", 
			"Entrepreneuriat", 
			"Analyse Numérique", 
			"Math Pour L'ingénieur",
			
			/*DEVELOPPEMENT INFORMATIQUE*/
			"Opt 2 : Fouille de Données",
			"Opt 9 : Big Data",
			"Opt 10 : Developpement iOS",
			"Opt 3 : Machine Learning-Deep Learning",
			"Opt 6 : Business Intelligence",
			"Opt 7 : Qualité et Test Logiciel",
			
			/*RESEAU INFORMATIQUE*/
			"Opt 4 : Transactions Electroniques",
			"Opt 1 : Cloud Computing",
			"Opt 8 : Sécurité Informatique",
			"Opt 5 : Réseaux IP",
			
			/*SYSTEME EMBARQUE*/
			"Opt 12 : Electronique Embarquée",
			"Opt 13 : Système Robotique",
			"Opt 14 : Conception des Cartes Electroniques",
			"Opt 15 : Réseau de Capteurs Sans Fils",
			
			/*SOFT SKILLS*/
			"Opt 11 : Management d'Equipe et Leadership",


			};

	private static List<Etudiant> etudiants = new ArrayList<>();
	
	

	// Initializing Etudiant data to insert into the excel file
	static {
		for (int i = 1; i <= 10000; i++) {

			double x1 =(double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x2 =(double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x3 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x4 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x5 =(double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x6 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x7 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x8 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x9 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x10 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x11 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x12 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x13 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x14 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x15 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x16 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x17 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x18 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x19 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			double x20 = (double) Math.round((Math.random() * (20 - 3))*100)/100 ;
			
			etudiants.add(new Etudiant(i, x1, x2, x3, x4, x5, x6, x7, x8, x9, x10, x11, x12, x13, x14,
					x15, x16, x17, x18, x19, x20));
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
			row.createCell(1).setCellValue(etudiant.getMatiere1());
			row.createCell(2).setCellValue(etudiant.getMatiere2());
			row.createCell(3).setCellValue(etudiant.getMatiere3());
			row.createCell(4).setCellValue(etudiant.getMatiere4());
			row.createCell(5).setCellValue(etudiant.getMatiere5());
			row.createCell(6).setCellValue(etudiant.getMatiere6());
			row.createCell(7).setCellValue(etudiant.getMatiere7());
			row.createCell(8).setCellValue(etudiant.getMatiere8());
			row.createCell(9).setCellValue(etudiant.getMatiere9());
			row.createCell(10).setCellValue(etudiant.getMatiere10());
			row.createCell(11).setCellValue(etudiant.getMatiere11());
			row.createCell(12).setCellValue(etudiant.getMatiere12());
			row.createCell(13).setCellValue(etudiant.getMatiere13());
			row.createCell(14).setCellValue(etudiant.getMatiere14());
			row.createCell(15).setCellValue(etudiant.getMatiere15());
			row.createCell(16).setCellValue(etudiant.getMatiere16());
			row.createCell(17).setCellValue(etudiant.getMatiere17());
			row.createCell(18).setCellValue(etudiant.getMatiere18());
			row.createCell(19).setCellValue(etudiant.getMatiere19());
			row.createCell(20).setCellValue(etudiant.getMatiere20());
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

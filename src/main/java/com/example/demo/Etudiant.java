package com.example.demo;


public class Etudiant {
	
	private int idEtudiant;
	private double ArchitecturedesOrdinateurs;
	private double TechniquesdeCompilation;
	private double RechercheOpérationnelle;
	private double DéveloppementMobile;
	private double ProgrammationMultimédias;
	private double Statistiques;
	private double BasesdeDonnéesAvancées;
	private double RéseauxInformatiques;
	private double ConceptionOrientéeObjet;
	private double ProgrammationOrientéeObjet;
	private double ConceptiondesBasesdeDonnées;
	private double SystèmeLogique;
	private double Probabilités;
	private double AlgorithmiqueetStructuresdeDonnées;
	private double Blockchain;
	private double ArchitectureLogicielle;
	private double SystèmesExploitation;
	private double Entrepreneuriat;
	private double AnalyseNumérique;
	private double MathPouringénieur;
	
	/*****OPTION*******/
	
	private double Opt2FouilleDonnées;
	private double Opt9BigData;
	private double Opt10DeveloppementiOS;
	private double Opt3MachineLearning;
	private double Opt6BusinessIntelligence;
	private double Opt4TransactionsElectroniques;
	private double Opt1CloudComputing;
	private double Opt8SécuritéInformatique;
	private double Opt5RéseauxIP;
	private double Opt16RéseauxGSM;
	private double Opt12ElectroniqueEmbarquée;
	private double Opt13SystèmeRobotique;
	private double Opt14ConceptionCartesElectroniques;
	private double Opt15RéseauCapteurs;
	private double Opt7QualitéTest;
	
	
	public Etudiant(int idEtudiant, 
			double architecturedesOrdinateurs, 
			double techniquesdeCompilation,
			double rechercheOpérationnelle, 
			double développementMobile, 
			double programmationMultimédias,
			double statistiques, 
			double basesdeDonnéesAvancées, 
			double réseauxInformatiques,
			double conceptionOrientéeObjet, 
			double programmationOrientéeObjet, 
			double conceptiondesBasesdeDonnées,
			double systèmeLogique, 
			double probabilités, 
			double algorithmiqueetStructuresdeDonnées, 
			double blockchain,
			double architectureLogicielle, 
			double systèmesExploitation, 
			double entrepreneuriat, 
			double analyseNumérique,
			double mathPouringénieur, 
			double opt2FouilleDonnées, 
			double opt9BigData, 
			double opt10DeveloppementiOS,
			double opt3MachineLearning, 
			double opt6BusinessIntelligence, 
			double opt4TransactionsElectroniques,
			double opt1CloudComputing, 
			double opt8SécuritéInformatique, 
			double opt5RéseauxIP, 
			double opt16RéseauxGSM,
			double opt12ElectroniqueEmbarquée, 
			double opt13SystèmeRobotique, 
			double opt14ConceptionCartesElectroniques,
			double opt15RéseauCapteurs, 
			double opt7QualitéTest) {
		super();
		this.idEtudiant = idEtudiant;
		ArchitecturedesOrdinateurs = architecturedesOrdinateurs;
		TechniquesdeCompilation = techniquesdeCompilation;
		RechercheOpérationnelle = rechercheOpérationnelle;
		DéveloppementMobile = développementMobile;
		ProgrammationMultimédias = programmationMultimédias;
		Statistiques = statistiques;
		BasesdeDonnéesAvancées = basesdeDonnéesAvancées;
		RéseauxInformatiques = réseauxInformatiques;
		ConceptionOrientéeObjet = conceptionOrientéeObjet;
		ProgrammationOrientéeObjet = programmationOrientéeObjet;
		ConceptiondesBasesdeDonnées = conceptiondesBasesdeDonnées;
		SystèmeLogique = systèmeLogique;
		Probabilités = probabilités;
		AlgorithmiqueetStructuresdeDonnées = algorithmiqueetStructuresdeDonnées;
		Blockchain = blockchain;
		ArchitectureLogicielle = architectureLogicielle;
		SystèmesExploitation = systèmesExploitation;
		Entrepreneuriat = entrepreneuriat;
		AnalyseNumérique = analyseNumérique;
		MathPouringénieur = mathPouringénieur;
		Opt2FouilleDonnées = opt2FouilleDonnées;
		Opt9BigData = opt9BigData;
		Opt10DeveloppementiOS = opt10DeveloppementiOS;
		Opt3MachineLearning = opt3MachineLearning;
		Opt6BusinessIntelligence = opt6BusinessIntelligence;
		Opt4TransactionsElectroniques = opt4TransactionsElectroniques;
		Opt1CloudComputing = opt1CloudComputing;
		Opt8SécuritéInformatique = opt8SécuritéInformatique;
		Opt5RéseauxIP = opt5RéseauxIP;
		Opt16RéseauxGSM = opt16RéseauxGSM;
		Opt12ElectroniqueEmbarquée = opt12ElectroniqueEmbarquée;
		Opt13SystèmeRobotique = opt13SystèmeRobotique;
		Opt14ConceptionCartesElectroniques = opt14ConceptionCartesElectroniques;
		Opt15RéseauCapteurs = opt15RéseauCapteurs;
		Opt7QualitéTest = opt7QualitéTest;
	}
	public int getIdEtudiant() {
		return idEtudiant;
	}
	public void setIdEtudiant(int idEtudiant) {
		this.idEtudiant = idEtudiant;
	}
	public double getArchitecturedesOrdinateurs() {
		return ArchitecturedesOrdinateurs;
	}
	public void setArchitecturedesOrdinateurs(double architecturedesOrdinateurs) {
		ArchitecturedesOrdinateurs = architecturedesOrdinateurs;
	}
	public double getTechniquesdeCompilation() {
		return TechniquesdeCompilation;
	}
	public void setTechniquesdeCompilation(double techniquesdeCompilation) {
		TechniquesdeCompilation = techniquesdeCompilation;
	}
	public double getRechercheOpérationnelle() {
		return RechercheOpérationnelle;
	}
	public void setRechercheOpérationnelle(double rechercheOpérationnelle) {
		RechercheOpérationnelle = rechercheOpérationnelle;
	}
	public double getDéveloppementMobile() {
		return DéveloppementMobile;
	}
	public void setDéveloppementMobile(double développementMobile) {
		DéveloppementMobile = développementMobile;
	}
	public double getProgrammationMultimédias() {
		return ProgrammationMultimédias;
	}
	public void setProgrammationMultimédias(double programmationMultimédias) {
		ProgrammationMultimédias = programmationMultimédias;
	}
	public double getStatistiques() {
		return Statistiques;
	}
	public void setStatistiques(double statistiques) {
		Statistiques = statistiques;
	}
	public double getBasesdeDonnéesAvancées() {
		return BasesdeDonnéesAvancées;
	}
	public void setBasesdeDonnéesAvancées(double basesdeDonnéesAvancées) {
		BasesdeDonnéesAvancées = basesdeDonnéesAvancées;
	}
	public double getRéseauxInformatiques() {
		return RéseauxInformatiques;
	}
	public void setRéseauxInformatiques(double réseauxInformatiques) {
		RéseauxInformatiques = réseauxInformatiques;
	}
	public double getConceptionOrientéeObjet() {
		return ConceptionOrientéeObjet;
	}
	public void setConceptionOrientéeObjet(double conceptionOrientéeObjet) {
		ConceptionOrientéeObjet = conceptionOrientéeObjet;
	}
	public double getProgrammationOrientéeObjet() {
		return ProgrammationOrientéeObjet;
	}
	public void setProgrammationOrientéeObjet(double programmationOrientéeObjet) {
		ProgrammationOrientéeObjet = programmationOrientéeObjet;
	}
	public double getConceptiondesBasesdeDonnées() {
		return ConceptiondesBasesdeDonnées;
	}
	public void setConceptiondesBasesdeDonnées(double conceptiondesBasesdeDonnées) {
		ConceptiondesBasesdeDonnées = conceptiondesBasesdeDonnées;
	}
	public double getSystèmeLogique() {
		return SystèmeLogique;
	}
	public void setSystèmeLogique(double systèmeLogique) {
		SystèmeLogique = systèmeLogique;
	}
	public double getProbabilités() {
		return Probabilités;
	}
	public void setProbabilités(double probabilités) {
		Probabilités = probabilités;
	}
	public double getAlgorithmiqueetStructuresdeDonnées() {
		return AlgorithmiqueetStructuresdeDonnées;
	}
	public void setAlgorithmiqueetStructuresdeDonnées(double algorithmiqueetStructuresdeDonnées) {
		AlgorithmiqueetStructuresdeDonnées = algorithmiqueetStructuresdeDonnées;
	}
	public double getBlockchain() {
		return Blockchain;
	}
	public void setBlockchain(double blockchain) {
		Blockchain = blockchain;
	}
	public double getArchitectureLogicielle() {
		return ArchitectureLogicielle;
	}
	public void setArchitectureLogicielle(double architectureLogicielle) {
		ArchitectureLogicielle = architectureLogicielle;
	}
	public double getSystèmesExploitation() {
		return SystèmesExploitation;
	}
	public void setSystèmesExploitation(double systèmesExploitation) {
		SystèmesExploitation = systèmesExploitation;
	}
	public double getEntrepreneuriat() {
		return Entrepreneuriat;
	}
	public void setEntrepreneuriat(double entrepreneuriat) {
		Entrepreneuriat = entrepreneuriat;
	}
	public double getAnalyseNumérique() {
		return AnalyseNumérique;
	}
	public void setAnalyseNumérique(double analyseNumérique) {
		AnalyseNumérique = analyseNumérique;
	}
	public double getMathPouringénieur() {
		return MathPouringénieur;
	}
	public void setMathPouringénieur(double mathPouringénieur) {
		MathPouringénieur = mathPouringénieur;
	}
	public double getOpt2FouilleDonnées() {
		return Opt2FouilleDonnées;
	}
	public void setOpt2FouilleDonnées(double opt2FouilleDonnées) {
		Opt2FouilleDonnées = opt2FouilleDonnées;
	}
	public double getOpt9BigData() {
		return Opt9BigData;
	}
	public void setOpt9BigData(double opt9BigData) {
		Opt9BigData = opt9BigData;
	}
	public double getOpt10DeveloppementiOS() {
		return Opt10DeveloppementiOS;
	}
	public void setOpt10DeveloppementiOS(double opt10DeveloppementiOS) {
		Opt10DeveloppementiOS = opt10DeveloppementiOS;
	}
	public double getOpt3MachineLearning() {
		return Opt3MachineLearning;
	}
	public void setOpt3MachineLearning(double opt3MachineLearning) {
		Opt3MachineLearning = opt3MachineLearning;
	}
	public double getOpt6BusinessIntelligence() {
		return Opt6BusinessIntelligence;
	}
	public void setOpt6BusinessIntelligence(double opt6BusinessIntelligence) {
		Opt6BusinessIntelligence = opt6BusinessIntelligence;
	}
	public double getOpt4TransactionsElectroniques() {
		return Opt4TransactionsElectroniques;
	}
	public void setOpt4TransactionsElectroniques(double opt4TransactionsElectroniques) {
		Opt4TransactionsElectroniques = opt4TransactionsElectroniques;
	}
	public double getOpt1CloudComputing() {
		return Opt1CloudComputing;
	}
	public void setOpt1CloudComputing(double opt1CloudComputing) {
		Opt1CloudComputing = opt1CloudComputing;
	}
	public double getOpt8SécuritéInformatique() {
		return Opt8SécuritéInformatique;
	}
	public void setOpt8SécuritéInformatique(double opt8SécuritéInformatique) {
		Opt8SécuritéInformatique = opt8SécuritéInformatique;
	}
	public double getOpt5RéseauxIP() {
		return Opt5RéseauxIP;
	}
	public void setOpt5RéseauxIP(double opt5RéseauxIP) {
		Opt5RéseauxIP = opt5RéseauxIP;
	}
	public double getOpt16RéseauxGSM() {
		return Opt16RéseauxGSM;
	}
	public void setOpt16RéseauxGSM(double opt16RéseauxGSM) {
		Opt16RéseauxGSM = opt16RéseauxGSM;
	}
	public double getOpt12ElectroniqueEmbarquée() {
		return Opt12ElectroniqueEmbarquée;
	}
	public void setOpt12ElectroniqueEmbarquée(double opt12ElectroniqueEmbarquée) {
		Opt12ElectroniqueEmbarquée = opt12ElectroniqueEmbarquée;
	}
	public double getOpt13SystèmeRobotique() {
		return Opt13SystèmeRobotique;
	}
	public void setOpt13SystèmeRobotique(double opt13SystèmeRobotique) {
		Opt13SystèmeRobotique = opt13SystèmeRobotique;
	}
	public double getOpt14ConceptionCartesElectroniques() {
		return Opt14ConceptionCartesElectroniques;
	}
	public void setOpt14ConceptionCartesElectroniques(double opt14ConceptionCartesElectroniques) {
		Opt14ConceptionCartesElectroniques = opt14ConceptionCartesElectroniques;
	}
	public double getOpt15RéseauCapteurs() {
		return Opt15RéseauCapteurs;
	}
	public void setOpt15RéseauCapteurs(double opt15RéseauCapteurs) {
		Opt15RéseauCapteurs = opt15RéseauCapteurs;
	}
	public double getOpt7QualitéTest() {
		return Opt7QualitéTest;
	}
	public void setOpt7QualitéTest(double opt7QualitéTest) {
		Opt7QualitéTest = opt7QualitéTest;
	}
	
	
	
	
	
	
	
	

}

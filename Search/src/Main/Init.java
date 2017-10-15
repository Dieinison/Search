package Main;

import java.util.HashMap;

import Utils.Action;
import Utils.Node;
import Utils.State;

/**
 * Basic Search Algorithms.
 * 
 * Check ReadMe for details on this program and on how to use it.
 * 
 * Authors/Students Numbers: 
 * 			Dieinison Jack Freire Braga / 368339
 * 			Maria Tassiane Barros de Lima / 391052
 * 			Yago da Cruz Ignacio
 * 
 * Institution: 
 * 			Federal University of Ceará, Campus Quixadá 
 */

public class Init {
	
	public static HashMap<String, Node> initMap() {
		//the map
		HashMap<String, Node> mapa = new HashMap<String, Node>();
		
		//Space of search
		State emArad = new State("Em(Arad)");
		State emZerind = new State("Em(Zerind)");
		State emSibiu = new State("Em(Sibiu)");
		State emTimissoara = new State("Em(Timisoara)");
		State emOradea = new State("Em(Oradea)");
		State emLugoj = new State("Em(Lugoj)");
		State emMehadia = new State("Em(Mehadia)");
		State emDrobeta = new State("Em(Drobeta)");
		State emCraiova = new State("Em(Craiova)");
		State emRimnicuVilcea = new State("Em(RimnicuVilcea)");
		State emFagaras = new State("Em(Fagaras)");
		State emPitesti = new State("Em(Pitesti)");
		State emBucharest = new State("Em(Bucharest)");
		State emGiurgiu = new State("Em(Giurgiu)");
		State emUrziceni = new State("Em(Urziceni)");
		State emHirsova = new State("Em(Hirsova)");
		State emEforie = new State("Em(Eforie)");
		State emVaslui = new State("Em(Vaslui)");
		State emIasi = new State("Em(Iasi)");
		State emNeamt = new State("Em(Neamt)");
		
		// Every city is a Node instance and a State
		Node arad = new Node(emArad);
		Node zerind = new Node(emZerind);
		Node sibiu = new Node(emSibiu);
		Node timissoara = new Node(emTimissoara);
		Node oradea = new Node(emOradea);
		Node lugoj = new Node(emLugoj);
		Node mehadia = new Node(emMehadia);
		Node drobeta = new Node(emDrobeta);
		Node craiova = new Node(emCraiova);
		Node rimnicu_vilcea = new Node(emRimnicuVilcea);
		Node fagaras = new Node(emFagaras);
		Node pitesti = new Node(emPitesti);
		Node bucharest = new Node(emBucharest);
		Node giurgiu = new Node(emGiurgiu);
		Node urziceni = new Node(emUrziceni);
		Node hirsova = new Node(emHirsova);
		Node eforie = new Node(emEforie);
		Node vaslui = new Node(emVaslui);
		Node iasi = new Node(emIasi);
		Node neamt = new Node(emNeamt);
		
		//edges and costs
		arad.addRoad(new Action(arad,zerind,75));
		arad.addRoad(new Action(arad,sibiu,140));
		arad.addRoad(new Action(arad,timissoara,118));
		zerind.addRoad(new Action(zerind, oradea,71));
		zerind.addRoad(new Action(zerind, arad, 75));
		sibiu.addRoad(new Action(sibiu, arad,140));
		sibiu.addRoad(new Action(sibiu, oradea, 151));
		sibiu.addRoad(new Action(sibiu, rimnicu_vilcea,80));
		sibiu.addRoad(new Action(sibiu, fagaras, 99));
		timissoara.addRoad(new Action(timissoara, arad, 118));
		timissoara.addRoad(new Action(timissoara, lugoj, 111));
		oradea.addRoad(new Action(oradea,zerind, 71));
		oradea.addRoad(new Action(oradea,sibiu,151));
		lugoj.addRoad(new Action(lugoj,mehadia, 70));
		lugoj.addRoad(new Action(lugoj,timissoara, 111));
		mehadia.addRoad(new Action(mehadia, lugoj,70));
		mehadia.addRoad(new Action(mehadia, drobeta, 75));
		craiova.addRoad(new Action(craiova, drobeta,120));
		craiova.addRoad(new Action(craiova, rimnicu_vilcea,146));
		craiova.addRoad(new Action(craiova, pitesti, 138));
		rimnicu_vilcea.addRoad(new Action(rimnicu_vilcea,sibiu, 80));
		rimnicu_vilcea.addRoad(new Action(rimnicu_vilcea,pitesti, 97));
		rimnicu_vilcea.addRoad(new Action(rimnicu_vilcea, craiova, 138));
		fagaras.addRoad(new Action(fagaras, sibiu, 99));
		fagaras.addRoad(new Action(fagaras, bucharest, 211));
		pitesti.addRoad(new Action(pitesti, rimnicu_vilcea, 97));
		pitesti.addRoad(new Action(pitesti, bucharest, 101));
		bucharest.addRoad(new Action(bucharest, fagaras, 211));
		bucharest.addRoad(new Action(bucharest,pitesti, 101));
		bucharest.addRoad(new Action(bucharest, giurgiu, 90));
		bucharest.addRoad(new Action(bucharest, urziceni, 85));
		giurgiu.addRoad(new Action(giurgiu, bucharest, 90));
		urziceni.addRoad(new Action(urziceni,bucharest, 85));
		urziceni.addRoad(new Action(urziceni, hirsova,  98));
		urziceni.addRoad(new Action(urziceni, vaslui, 142));
		hirsova.addRoad(new Action(hirsova, urziceni, 98));
		hirsova.addRoad(new Action(hirsova, eforie, 86));
		eforie.addRoad(new Action(eforie, hirsova, 86));
		vaslui.addRoad(new Action(vaslui,urziceni, 142));
		vaslui.addRoad(new Action(vaslui, iasi, 92));
		iasi.addRoad(new Action(iasi, vaslui, 92));
		iasi.addRoad(new Action(iasi,neamt, 87));
		neamt.addRoad(new Action(neamt, iasi, 87));
		
		mapa.put(emArad.getDescription(), arad);
		mapa.put(emTimissoara.getDescription(), timissoara);
		mapa.put(emZerind.getDescription(), zerind);
		mapa.put(emOradea.getDescription(), oradea);
		mapa.put(emSibiu.getDescription(), sibiu);
		mapa.put(emLugoj.getDescription(), lugoj);
		mapa.put(emMehadia.getDescription(), mehadia);
		mapa.put(emDrobeta.getDescription(), drobeta);
		mapa.put(emCraiova.getDescription(), craiova);
		mapa.put(emRimnicuVilcea.getDescription(), rimnicu_vilcea);
		mapa.put(emPitesti.getDescription(), pitesti);
		mapa.put(emFagaras.getDescription(), fagaras);
		mapa.put(emBucharest.getDescription(), bucharest);
		mapa.put(emGiurgiu.getDescription(), giurgiu);
		mapa.put(emUrziceni.getDescription(), urziceni);
		mapa.put(emHirsova.getDescription(), hirsova);
		mapa.put(emEforie.getDescription(), eforie);
		mapa.put(emVaslui.getDescription(), vaslui);
		mapa.put(emIasi.getDescription(), iasi);
		mapa.put(emNeamt.getDescription(), neamt);
		
		return mapa;
	}

}

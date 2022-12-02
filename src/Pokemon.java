import java.util.Iterator;

/*
 * Progettare una base di dati per gestire i Pokèmon presenti 
 * nella città di Biancavilla, composta dalla seguente tabella. 


pokemon(int id, string name, string elementType, int level). 

Creare un progetto Java che consenta tramite JDBC e driver per
 MySQL di struttura interfaccia DAO e i metodi per le CRUD base. 

 */
public class Pokemon {
    int id;
    String name;
    String elementType;
    int level;

 public Pokemon(int id, String name , String elementType, int level){
this.id=id;
this.name=name;
this.elementType=elementType;
this.level=level;
 }   public int getId(){
    return id;
 }
public void setId(int id){
    this.id=id;
}
public String getName(){
    return name;
}
public void setName(String name){
this.name=name;
}
public String getElmentType(){
return elementType;
}
public void setElementType(String elementType){
this.elementType=elementType;
}
public int setLevel(){
    return level;
}
public static Iterator<Pokemon> iterator() {
    return null;
}

}

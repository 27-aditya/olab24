package newshelf;

public sealed interface IBook permits Comic,Fiction,TextBook{

}

enum FictionType {
    Shakespeare,
	Self_Interest,
	Satire
}

record Comic(String Title,int ageOfMainCharacter) implements IBook {
	

}

record Fiction(String name,FictionType type) implements IBook {


}

record TextBook(String subject) implements IBook {


}
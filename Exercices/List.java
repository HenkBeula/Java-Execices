package henks.datastructure;

/**
 * 
 * @Author Henk Beula
 * List implementation
 * 
 */

public class List{
    private int size;//tamanho da lista ex: list[10], entao tamanho = 10.
    private int [] list;
    private int length;//comprimento da lista ex: list{10,13,1}, entao comprimento = 3

    public List(int size){
        this.list = new int[size];
        this.size = size;
    }

    public int size(){//returns list size. Sendo uma lista estatica, 
        //tem um tamanho predefinido que e o mostrado aqui.
        return this.size;
    }

    public int getLength(){//returns list length. Este e o comprimento da lista,
        //que e diferente do tamanho, o comprimento faz referencia ao numero de elementos presentes
        return this.length;
    }

    public void insert(int index, int data){
        for(int i = this.length - 1; i >= index + 1; i--){//inicia do fim da lista ate uma posicao antes na qual se pretende inserir
            list[i] = list[i-1];//trocar o atual pelo anterior
        }
        list[index] = data;//insert data
        this.length++;//increases list length
    }

    public void remove(int index){//removes list element
        for(int i = index; i < this.length - 1; i++){//inicia de onde pretendes inserir ate o fim da lista
            list[i] = list [i+1];
        }
        list[this.length-1]=0;
        this.length--;//decreases list length
    }

    public void update(int index, int data){//atualiza um elemento da lista
        this.list[index] = data;
    }

    public int getElement(int index){//returns list element
        return this.list[index];
    }

}

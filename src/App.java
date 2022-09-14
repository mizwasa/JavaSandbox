import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        
        List list = new ArrayList();
        list.add("Java");
        String element =  (String)list.get(0); //キャストが必要
        
        //上記がジェネリクス使うとこうなる
        List<String> geneList = new ArrayList<String>();
        // List<String> geneLitt = new ArrayList<>();
        geneList.add("Java");
        String geneElement = geneList.get(0);
        System.out.println(geneElement);


        StringStack strStack = new StringStack();

        String strElement = strStack.pop();

        strStack.push("Scala");
        strStack.push("Groovy");
        strStack.push("Java");

        strElement = strStack.pop();

        if(strElement != null){
            System.out.println(strElement);
        }

        //GenericStackを利用する場合
        GenericStack<String> genStack = new GenericStack<>();
        genStack.push("Scala");
        String genElement = genStack.pop();
        if(genElement != null){
            System.out.println(genElement);
        }

        GenericStack<Integer> genStack2 = new GenericStack<>();
        genStack2.push(100);
        Integer genElement2 = genStack2.pop();
        if(genElement2 != null){
            System.out.println(genElement2);
        }

        //GenericStackUtilを利用する例
        List<String> strList = new ArrayList<>();
        strList.add("Groovy");
        strList.add("Java");
        GenericStack<String> gstack = GenericStackUtil.as(strList);

        //NumberStackを利用する例
        NumberStack<Integer> intStack = new NumberStack<>();
        NumberStack<Long> longStack = new NumberStack<>();
        // NumberStack<String> numberStack = new NumberStack<>(); // StringはNumberの子クラスではないためコンパイルエラー
        
        intStack.push(100);
        intStack.push(200);

        Integer numElement = intStack.pop();

        if(numElement != null){
            System.out.println(numElement);
        }
    }
}

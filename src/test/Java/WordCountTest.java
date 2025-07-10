package test.java;
import org.junit.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class WordCountTest {

    @Test
   public void testwordcount(){
  WordCount wordcount = new WordCount();
     int count= wordcount.count ("fdlkkfj fkjfjf fjfjpf");
     Assertions.assertequals(10,count);
   }

   @Test
   public void testAnotherstring(){
    WordCount wordcount=new WordCount();
    int count = wordcount.count("vetias");
    Assertions.assertequals(1,count);
   }
}

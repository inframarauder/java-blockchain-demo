import java.lang.*;
import java.util.*;
import java.text.SimpleDateFormat;

public class Main {
    ArrayList<Block> blockchain = new ArrayList<>();

    public static void main(String args[]) {
        /**
         * Any change in the transactions shall yield a completely different hash value
         * for every block.
         */

        String[] genesisTransactions = { "Tony Stark sent 100 bitcoins to Bruce Wayne",
                "Bruce Wayne sent 50 bitcoins to Bruce Banner" };
        Block genesisBlock = new Block(0, genesisTransactions); // Create the first block of the blockchain
        System.out.println("Hash of genesis block : " + genesisBlock.getBlockHash());
        // Create subsequent blocks:
        String[] block2Transactions = { "I gave 100 bitcoins to my friend", "My friend gave me 50 coins" };
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);
        System.out.println("Hash of block 2:" + block2.getBlockHash());
        /**
         * More blocks may be added
         */
    }
}
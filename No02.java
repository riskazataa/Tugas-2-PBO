public class No02 {
    public static void main(String[]args) {
        GameCharacter pemain1 = new GameCharacter("Raiden",10,20);
        GameCharacter pemain2 = new GameCharacter("Sub-Zero",5,25);
        pemain1.kick(pemain2);
        pemain2.kick(pemain1);

        for (int i=0;i<3;i++){
            pemain2.hit(pemain1);
        }

        for (int i=0;i<4;i++){
            pemain1.kick(pemain2);
        }

        System.out.println("Raiden = "+pemain1.getLifepoint());
        System.out.println("Sub-Zero = "+pemain2.getLifepoint());

        pemain1.compare(pemain2);
    }
}

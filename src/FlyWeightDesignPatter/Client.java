package FlyWeightDesignPatter;

public class Client {
    public static void main(String[] args) {


        /*
            a class can be divided into 2 parts based on types of properties
                    1. Extrinsic - values of which might change with time.
                    2. Intrinsic - values of which remains same with time across all the objects.

            If we take all the attributes in one class like we have taken in OldBullet class
                - It will take a lot of space in memory
                        Let us suppose if we have 100,000 bullets then the total memory usage is 100 MB
                        which is quite high

            To reduce this what we can do is create two different classes based on extrinsic and intrinsic properties

            If we have 10 different type of bullets in the game then we can use only
                    (10 * (intrinsic object size)) + (100,000 * (extrinsic object size)) = around(9 MB)
            memory which is very less as compared to the previous one where we are taking all the attributes together.

            So, Fly Weight design pattern is used to reduce the memory usage and make the software more efficient

            for this we have created 2 classes as discussed above - flyingBullets(extrinsic) and Bullets(intrinsic)
         */
    }
}

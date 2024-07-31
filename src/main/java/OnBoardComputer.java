public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        int sp = status.getVelocity();
        int a = status.getAltitude();
        int burn = 100;
        int zz = 0; // burn delta from 100;

        // a = (speed * speed)/(2 * altitude) // from readme.
        zz = (sp * sp) / ( 2 * a); /* Put Sir Isaac Newton in the driver seat. */
        burn = zz + 99; // use 99 to always drift downward (due to integer div)
        //System.out.print("["+zz+"] "); /*print estimated burn above 100 */
        if (burn > 200) burn = 200; // if Newton wants more fuel than 200, deny it
        System.out.println(burn);
        return burn;





//        int burn = (status.getVelocity() * status.getVelocity()) / (2 * status.getAltitude());

//
//        System.out.println(burn); /*hack!*/
//        return burn;
    }

}

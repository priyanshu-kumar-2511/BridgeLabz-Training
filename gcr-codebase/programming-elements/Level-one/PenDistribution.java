class PenDistribution {
    public static void main(String[] args) {
        int TotalPens = 14;
        int Students = 3;

        int PensPerStudent = TotalPens / Students;
        int RemainingPens = TotalPens % Students;

        System.out.println("The Pen Per Student is " + PensPerStudent +
                           " and the remaining pen not distributed is " + RemainingPens);
    }
}

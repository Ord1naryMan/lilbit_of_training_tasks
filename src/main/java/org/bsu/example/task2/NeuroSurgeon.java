package org.bsu.example.task2;

public class NeuroSurgeon extends Surgeon {

    public NeuroSurgeon() {
        super();
    }

    public NeuroSurgeon(String id, String fullName) {
        super(id, fullName);
    }

    @Override
    public void startWorkingDay() {
        //imagine here call to service layer

        //employeeService.addArriveRecordFor(id);
    }

    @Override
    public void endWorkingDay() {
        //imagine here call to service layer

        //employeeService.addLeaveRecordFor(id);
    }

    @Override
    public void prescribeMedicine(String medicineName,
                                  String patientId,
                                  String patientFullName) {
        //imagine here call to service layer

        //doctorService.addPrescribedMedicineRecord(id, medicineName,
        //                                          patientId, patientFullName);
    }

    @Override
    public void doSurgery(String surgeryType,
                          String patientId,
                          String patientFullName) {
        //imagine here call to service layer

        //surgeonService.addSurgeryRecord(id, surgeryType,
        //                                  patientId, patientFullName);
    }
}

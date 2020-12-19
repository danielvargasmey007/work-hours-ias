export interface Report {
  id?: number;
  startDate: string;
  endDate: string;
  idTechnician: string;
  idService: string;
  startWeek?: number;
  endWeek?: number;
}

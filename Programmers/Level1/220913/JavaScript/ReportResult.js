export function answerLength(idList) {
  const answer = new Array(idList.length);
  answer.fill(0);
  return answer;
}

export function createReportList(idList) {
  const reportList = {};
  idList.map((id) => {
    reportList[id] = [];
  });

  return reportList;
}

export function createReporterAndReporteeList(report, reportList) {
  report.map((name) => {
    const [reporterId, reporteeId] = name.split(' ');
    if (!reportList[reporteeId].includes(reporterId)) {
      reportList[reporteeId].push(reporterId);
    }
  });

  return reportList;
}

export function ReportResult(idList, report, k) {
  const answer = answerLength(idList);

  const reportList = createReportList(idList);

  const reporterAndReporteeList = createReporterAndReporteeList(report, reportList);

  for (const key in reporterAndReporteeList) {
    if (reporterAndReporteeList[key].length >= k) {
      reporterAndReporteeList[key].map((id) => {
        answer[idList.indexOf(id)] += 1;
      });
    }
  }

  return answer;
}

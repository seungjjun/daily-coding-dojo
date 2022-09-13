import {
  answerLength, createReporterAndReporteeList, createReportList, ReportResult,
} from './ReportResult';

test('answerLength', () => {
  expect(answerLength(['muzi', 'frodo', 'apeach', 'neo']))
    .toStrictEqual([0, 0, 0, 0]);
});

test('reportList', () => {
  expect(createReportList(['muzi', 'frodo', 'apeach', 'neo']))
    .toStrictEqual({
      apeach: [],
      frodo: [],
      muzi: [],
      neo: [],
    });
});

test('createReporterAndReporteeList', () => {
  expect(createReporterAndReporteeList(
    ['muzi frodo', 'apeach frodo', 'frodo neo', 'muzi neo', 'apeach muzi'],
    {
      apeach: [],
      frodo: [],
      muzi: [],
      neo: [],
    },
  )).toStrictEqual({
    apeach: [],
    frodo: ['muzi', 'apeach'],
    muzi: ['apeach'],
    neo: ['frodo', 'muzi'],
  });
});

test('ReportResult', () => {
  expect(ReportResult(
    ['muzi', 'frodo', 'apeach', 'neo'],
    ['muzi frodo', 'apeach frodo', 'frodo neo', 'muzi neo', 'apeach muzi'],
    2,
  )).toStrictEqual([2, 1, 1, 0]);
});

<!DOCTYPE html>
<!--
// Licensed to Elasticsearch B.V. under one or more contributor
// license agreements. See the NOTICE file distributed with
// this work for additional information regarding copyright
// ownership. Elasticsearch B.V. licenses this file to you under
// the Apache License, Version 2.0 (the "License"); you may
// not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
-->
<html lang="en">

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <meta charset="UTF-8">
  <title>Email</title>
</head>

<body style="margin: 0; padding: 0;">
  <table logopacing="0" style="table-layout: fixed;max-width: 90%;width: 800px;border-collapse: collapse;margin: 0 auto;">
    <thead style="background-color: #FFFFFF;">
      <tr>
        <td colspan="7" style="height: 32px;"></td>
      </tr>
      <tr>
        <td rowspan="2" colspan="2" style="padding: 0 0 10px 0;width: 156px;text-align: center;">
          <img alt="logo" src="https://avatars0.githubusercontent.com/u/6764390?s=100&v=4">
        </td>
        <td colspan="3" style="font-family: Helvetica; font-size: 12px; color: #343B49; letter-spacing: 2px; line-height: 16px; text-transform: uppercase;">
          Observability-robots
        </td>
        <td rowspan="2" colspan="1" style="padding-left: 10px;"></td>
      </tr>
      <tr>
        <td colspan="4" style="letter-spacing:1px;font-weight:700;font-size:24px;line-height:30px;font-family:,Helvetica;padding-right:24px">
          ${statusSuccess ? 'The job is done' : "The job couldn't be done"}
        </td>
      </tr>
      <tr>
        <td colspan="1" style="height: 10px; width: 30px"></td>
        <td colspan="2" style="height: 10px;"></td>
        <td colspan="3" style="height: 10px;"></td>
        <td colspan="1" style="height: 10px; width: 100px"></td>
      </tr>
      <tr>
        <td colspan="7" style="background-color: #F4F4F4;padding: 0 24px 0 24px;font-family: Helvetica; font-size: 10px; color: #AEAEAE; letter-spacing: 2px; line-height: 16px; margin-bottom: 0; text-transform: uppercase;">
          Observability
        </td>
      </tr>
      <tr>
        <td colspan="7" style="background-color: #F4F4F4;text-align: right;padding-right: 67px;">
          <ul style="list-style-type: none; margin: 0; padding: 0;">
            <li style="display: inline; letter-spacing: 1px; font-weight: 700; font-size: 12px; line-height: 20px; font-family: Helvetica; padding-right: 24px;">
              <a href="${jobUrl}" style="text-decoration: none; color: #343B49;">Pipeline</a>
            </li>
            <li style="display: inline; letter-spacing: 1px; font-weight: 700; font-size: 12px; line-height: 20px; font-family: Helvetica; padding-right: 24px;">
              <a href="${jobUrl}/tests" style="text-decoration: none; color: #343B49;">Tests</a>
            </li>
            <li style="display: inline; letter-spacing: 1px; font-weight: 700; font-size: 12px; line-height: 20px; font-family: Helvetica; padding-right: 24px;">
              <a href="${jobUrl}/changes" style="text-decoration: none; color: #343B49;">Changes</a>
            </li>
            <li style="display: inline; letter-spacing: 1px; font-weight: 700; font-size: 12px; line-height: 20px; font-family: Helvetica; padding-right: 24px;">
              <a href="${jobUrl}/artifacts" style="text-decoration: none; color: #343B49;">Artifacts</a>
            </li>
            <li style="display: inline; letter-spacing: 1px; font-weight: 700; font-size: 12px; line-height: 20px; font-family: Helvetica;">
              <a href="${statsUrl}" style="text-decoration: none; color: #343B49;">Stats</a>
            </li>
          </ul>
        </td>
      </tr>
      <tr>
        <td colspan="7" style="background-color: #F4F4F4;margin: 6px;">
        </td>
      </tr>
    </thead>
    <tbody style="background-color: #F4F4F4;">
      <tr>
        <td colspan="1"></td>
        <td colspan="2" style="height: 24px;position: relative;">
        </td>
        <td colspan="4"></td>
      </tr>
      <!--TABLE_BUILD-->
      <tr>
        <td rowspan="3" colspan="1" style="text-align: center;">
          <%if(statusSuccess){%>
            <img alt="jenkins" src="https://avatars0.githubusercontent.com/u/107424?s=100&v=4" style="max-height: 100%;max-width: 100%;width: 100px;">
          <%} else {%>
            <img alt="jenkins" src="https://raw.githubusercontent.com/jenkinsci/jenkins/master/war/src/main/webapp/images/rage.png" style="max-height: 100%;max-width: 100%;width: 100px;">
          <%}%>
        </td>
        <td colspan="2" style="vertical-align: bottom;font-family: Georgia; font-weight: bold; font-size: 16px; color: #343B49; letter-spacing: 1px; line-height: 16px;">
          Jenkins
        </td>
        <td rowspan="3" colspan="3"></td>
        <td rowspan="3" colspan="1" style="padding-right: 24px;">
          <table logopacing="0" cellpadding="0" style="text-align: right;width:90%">
            <tr>
              <td width="64px" height="142px">
                <a href="${jobUrl}" style="text-decoration: none;display: inline-block;height: 72px;width: 72px;line-height: 76px;text-align: center">
                <img alt="arrow" style="max-height: 100%;max-width: 100%;height: 100px;" src="http://clipart-library.com/images/gTeEKq6Gc.png">
                <!--
                <img alt="arrow" style="max-height: 100%;max-width: 100%;height: 100px;" src="http://clipart-library.com/images/Bigr66BgT.png">
                <img alt="arrow" style="max-height: 100%;max-width: 100%;height: 100px;" src="http://clipart-library.com/images/6Tp5ee47c.png">
                <img alt="arrow" style="max-height: 100%;max-width: 100%;height: 100px;" src="http://clipart-library.com/images/8iEb9gdyT.png">
                -->
                </a>
              </td>
            </tr>
          </table>
        </td>
      </tr>
      <tr>
        <td colspan="5" style="vertical-align: middle; font-family: Helvetica; font-size: 24px; color: #343B49; letter-spacing: 1px; line-height: 30px;overflow: hidden;word-break: break-word;">
          ${jenkinsText}
        </td>
      </tr>
      <tr>
        <td colspan="2" style="vertical-align: baseline; font-family: Lato, Helvetica; font-size: 16px; color: ${statusSuccess ? '#00D06D' : '#FF0082'}; letter-spacing: 1px; line-height: 16px; font-weight:900; text-transform: capitalize;">
          ${statusSuccess ? 'successful' : 'failed'}
        </td>
      </tr>
      <tr>
        <td colspan="7" style="height: 32px;"></td>
      </tr>
      <tr>
        <td colspan="7" style="padding-left: 24px;text-align: left; vertical-align: middle; font-family: Helvetica; font-size: 12px; color: #343B49; letter-spacing: 1px;">
          <strong style="font-family: Helvetica; color: #343B49;">Build Cause:</strong> ${build?.causes?.shortDescription}<br>
          <strong style="font-family: Helvetica; color: #343B49;">Start Time:</strong> ${build?.startTime}<br>
          <% if(build?.durationInMillis >= 0) {%>
            <strong style="font-family: Helvetica; color: #343B49;">Duration:</strong> ${Math.round(build.durationInMillis/1000/60)} min ${Math.round(build.durationInMillis/1000)%60} sec - (${build.durationInMillis})<br>
          <%}%>
        </td>
      </tr>
      <!--TABLE_BUILD-->
      <tr>
        <td colspan="7" style="height: 32px;"></td>
      </tr>
      <!--TABLE_CHANGES-->
      <tr style="background-color: #F4F4F4;${ changeSet?.size() != 0 ? '' : 'display: none;' }">
        <td colspan="6" style="padding-left: 24px;font-family: Helvetica; font-size: 10px; color: #343B49; letter-spacing: 2px; line-height: 16px; margin-bottom: 0; text-transform: uppercase;">
          Changes
          <hr>
        </td>
        <td colspan="1" style="background-color: #F4F4F4;"></td>
      </tr>
      <tr>
        <td colspan="7" style="padding-left: 24px;border-collapse: collapse;background-color: #F4F4F4;">
          <table logopacing="0" cellpadding="0" style="text-align: left;font-size: 12px;">
          <% changeSet?.each{ c -> %>
            <tr>
              <td>
                <strong style="font-family: Helvetica; color: #343B49;">Author:</strong> ${c?.author?.id != null ? c?.author?.id : ''}<br>
                <strong style="font-family: Helvetica; color: #343B49;">Full Name:</strong>  ${ c?.author?.fullName != null ? c?.author?.fullName : ''}<br>
                <strong style="font-family: Helvetica; color: #343B49;">email:</strong>  ${c?.author?.email != null ? c?.author?.email : ''}</br>
                <strong style="font-family: Helvetica; color: #343B49;">Commit:</strong>  <a href="${c?.url}">${c?.commitId}</a><br>
                <strong style="font-family: Helvetica; color: #343B49;">Message:</strong>  ${c?.msg != null ? c?.msg : ''}<br>
                <strong style="font-family: Helvetica; color: #343B49;">Date:</strong>  ${c?.timestamp}<br>
                <hr>
              </td>
            </tr>
          <%}%>
          </table>
        </td>
      </tr>
      <!--TABLE_CHANGES-->
      <% stepsErrors = stepsErrors?.findAll{item -> item?.result == "FAILURE"}%>
      <tr>
        <td colspan="7" style="height: 32px;${ stepsErrors?.size() != 0 ? '' : 'display: none;' }"></td>
      </tr>
      <!--TABLE_STEP_ERRORS-->
      <tr style="background-color: #F4F4F4;${ stepsErrors?.size() != 0 ? '' : 'display: none;' }">
        <td colspan="6" style="padding-left: 24px;font-family: Helvetica; font-size: 10px; color: #343B49; letter-spacing: 2px; line-height: 16px; margin-bottom: 0; text-transform: uppercase;">
          Step Errors
          <hr>
        </td>
        <td colspan="1" style="background-color: #F4F4F4;"></td>
      </tr>
      <tr>
        <td colspan="7" style="padding-left: 24px;border-collapse: collapse;background-color: #F4F4F4;">
          <table logopacing="0" cellpadding="0" style="text-align: left;font-size: 12px;table-layout: fixed;width: 90%;">
          <% stepsErrors?.findAll{item -> item?.result == "FAILURE"}.each{ c -> %>
            <tr>
              <td>
              <strong style="font-family: Helvetica; color: #343B49;">Name:</strong> ${c?.displayName ? c?.displayName : ''}<br>
              <strong style="font-family: Helvetica; color: #343B49;">Description:</strong>  ${c?.displayDescription ? c?.displayDescription : ''}<br>
              <strong style="font-family: Helvetica; color: #343B49;">Result:</strong>  ${c?.result ? c?.result : ''}<br>
              <% if(c?.durationInMillis >= 0) {%>
                <strong style="font-family: Helvetica; color: #343B49;">Duration:</strong>  ${Math.round(c.durationInMillis/1000/60)} min ${Math.round(c.durationInMillis/1000)%60} sec</a><br>
              <%}%>
              <strong style="font-family: Helvetica; color: #343B49;">Start Time:</strong>  ${c?.startTime ? c?.startTime : ''}</a><br>

              <% c.actions?.findAll{item -> item?.urlName == "log"}.each{ l ->%>
                <a href="${jenkinsUrl}/${l._links.self.href}">Log</a><br>
              <%}%>
              <hr>
              </td>
            </tr>
          <%}%>
          </table>
        </td>
      </tr>
      <!--TABLE_STEP_ERRORS-->
      <tr>
        <td colspan="7" style="height: 32px;${ testsSummary?.total != null ? '' : 'display: none;' }"></td>
      </tr>
      <!--TABLE_TEST-->
      <tr style="background-color: #F4F4F4;${ testsSummary?.total != null ? '' : 'display: none;' }">
        <td colspan="6" style="padding-left: 24px;padding-top: 10px;vertical-align: bottom; font-family: Helvetica; font-size: 12px; color: #343B49; letter-spacing: 2px; line-height: 16px; text-transform: uppercase;">
          Test Results
          <hr>
        </td>
        <td colspan="1" style="background-color: #F4F4F4;"></td>
      </tr>
      <tr style="${ testsSummary?.total != null ? '' : 'display: none;' }">
        <td colspan="7" style="padding-left: 24px;text-align: left; border-collapse: collapse;font-size: 12px;">
          <strong style="font-family: Helvetica; color: #343B49;">Failed:</strong>  ${testsSummary?.failed}<br>
          <strong style="font-family: Helvetica; color: #343B49;">Passed:</strong>  ${testsSummary?.passed}<br>
          <strong style="font-family: Helvetica; color: #343B49;">Skipped:</strong>  ${testsSummary?.skipped}<br>
          <strong style="font-family: Helvetica; color: #343B49;">Total:</strong>  ${testsSummary?.total}<br>
        </td>
      </tr>
      <!--TABLE_TEST-->
      <% testsErrors = testsErrors?.findAll{item -> item?.status == "FAILED"}%>
      <tr>
        <td colspan="7" style="height: 32px;${ testsErrors?.size() != 0 ? '' : 'display: none;' }"></td>
      </tr>
      <!--TABLE_TEST_ERRORS-->
      <tr style="background-color: #F4F4F4;${ testsErrors?.size() != 0 ? '' : 'display: none;' }">
        <td colspan="6" style="padding-left: 24px;font-family: Helvetica; font-size: 10px; color: #343B49; letter-spacing: 2px; line-height: 16px; margin-bottom: 0; text-transform: uppercase;">
          Test Errors
          <hr>
        </td>
        <td colspan="1" style="background-color: #F4F4F4;"></td>
      </tr>
      <tr>
        <td colspan="7" style="padding-left: 24px;border-collapse: collapse;background-color: #F4F4F4;">
          <table logopacing="0" cellpadding="0" style="text-align: left;font-size: 12px;table-layout: fixed;width: 90%;">
          <% testsErrors?.findAll{item -> item?.status == "FAILED"}.each{ c -> %>
            <tr>
              <td>
              <strong style="font-family: Helvetica; color: #343B49;">Name:</strong> ${c?.name}<br>
              <strong style="font-family: Helvetica; color: #343B49;">Status:</strong>  ${c?.status}<br>
              <strong style="font-family: Helvetica; color: #343B49;">Age:</strong>  ${c?.age}</br>
              <strong style="font-family: Helvetica; color: #343B49;">Duration:</strong>  ${c?.duration}</a><br>
              <strong style="font-family: Helvetica; color: #343B49;">Error Details:</strong>
              <div style="font-family:courier;font-size:10px;text-align:left;overflow:auto;max-height: 30em;min-height: 10em;">${c?.errorDetails}</div>
              <strong style="font-family: Helvetica; color: #343B49;">Error StackTrace:</strong>
              <pre style="font-family:courier;font-size:10px;text-align:left;overflow:auto;max-height: 30em;min-height: 10em;">${c?.errorStackTrace}</pre>
              <hr>
              </td>
            </tr>
          <%}%>
          </table>
        </td>
      </tr>
      <!--TABLE_TEST_ERRORS-->
      <tr>
        <td colspan="7" style="height: 32px;${ log != null && !statusSuccess ? '' : 'display: none;' }"></td>
      </tr>
      <!--TABLE_LOG-->
      <tr style="background-color: #F4F4F4;${ log != null && !statusSuccess ? '' : 'display: none;' }">
        <td colspan="6" style="padding-left: 24px;font-family: Helvetica; font-size: 10px; color: #343B49; letter-spacing: 2px; line-height: 16px; margin-bottom: 0; text-transform: uppercase;">
          Log
          <hr>
        </td>
        <td colspan="1" style="background-color: #F4F4F4;"></td>
      </tr>
      <tr style="${ log != null && !statusSuccess ? '' : 'display: none;' }">
        <td colspan="7" style="padding: 0 24px 0 24px;border-collapse: collapse;background-color: #F4F4F4;">
          <pre style="font-family: courier;font-size: 10px;text-align:left;overflow: auto;">${log}</pre>
        </td>
      </tr>
      <!--TABLE_LOG-->
      <tr>
        <td colspan="7" style="height: 32px;"></td>
      </tr>
    </tbody>
  </table>
</body>

</html>

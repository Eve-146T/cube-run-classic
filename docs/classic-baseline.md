# Classic baseline

Cube Run Classic starts at upstream **v1.4**, commit
`5b5890ceb49aaedf0a8198a9f2123f005b7aaaa1`, released July 2, 2026.
This is the latest released version before the v2.0 beta and v2.0 release.
The repository preserves the complete ancestry of that commit and the GPL-3.0 license.

The initial Classic commit changes only the Android package/namespace/source package
to `cube.run.classic`, the visible app name to **Cube Run Classic**, the Gradle
project and CI artifact names, and repository documentation/metadata.
Version name **1.4** and version code **5** are retained. The initial setup is not a
new tagged release. The original icon, screenshots, and gameplay are retained.
A separate application ID gives Classic its own Android storage and allows both
apps to be installed together; existing Cube Run scores/settings are not migrated.

## Issue context reviewed

- [Cube Run Classic (#4)](https://github.com/Eve-146T/cube-run/issues/4) tracks the
  separate Classic edition.
- [Some Issues with 2.0 + Suggestions (#3)](https://github.com/Eve-146T/cube-run/issues/3)
  requests simple, responsive v1.x gameplay without power-ups, extra lives, or
  bonus worlds. Comments ask for the minimalist experience; the maintainer
  confirms plans for a separate Cube Run Classic app. Elevated platforms and
  jump pads remain a discussion, not an agreed port.
- [Suggestions (#2)](https://github.com/Eve-146T/cube-run/issues/2) raises obstacle
  readability, speed-based scoring, and sections that can be too easy.
- [Optimize Responsiveness (#5)](https://github.com/Eve-146T/cube-run/issues/5),
  [fix unfair sections (#6)](https://github.com/Eve-146T/cube-run/issues/6), and
  [fix floating world (#7)](https://github.com/Eve-146T/cube-run/issues/7) are
  related ongoing Cube Run work; they are not changes in this baseline.
- [Add mute option (#1)](https://github.com/Eve-146T/cube-run/issues/1) is closed;
  v1.4 already includes sound/vibration toggles.

## Stop point

Repository setup only. Evaluate sections, responsiveness, performance fixes,
vertical movement, and any other ports together before changing this baseline.
Do not merge the current Cube Run 2.x or performance branch wholesale.
Do not reuse or publish upstream signing credentials. Configure Classic release
signing separately when preparing its first release.

## Setup validation

- `assembleDebug assembleRelease lint --offline` passed with JDK 17 and SDK 35.
- Lint reports zero errors and the inherited `OldTargetApi` warning for target 35.
- Both APK manifests report `cube.run.classic`, label `Cube Run Classic`, version
  name `1.4`, and version code `5`; the release APK is unsigned.
- All 12 Kotlin files match v1.4 byte-for-byte after reversing the package rename.
  The license is unchanged.
- No device installation or gameplay ports were performed during setup.

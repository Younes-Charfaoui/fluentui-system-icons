package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.SpeakerBox16: ImageVector
  get() {
    if (_speakerBox16 != null) {
      return _speakerBox16!!
    }
    _speakerBox16 = fluentIcon(name = "Regular.SpeakerBox16", 16f) {
      materialPath {
          moveTo(3.0F, 3.5F)
          curveTo(3.0F, 2.12F, 4.12F, 1.0F, 5.5F, 1.0F)
          horizontalLineToRelative(5.0F)
          curveTo(11.88F, 1.0F, 13.0F, 2.12F, 13.0F, 3.5F)
          verticalLineToRelative(9.0F)
          curveToRelative(0.0F, 1.38F, -1.12F, 2.5F, -2.5F, 2.5F)
          horizontalLineToRelative(-5.0F)
          curveTo(4.12F, 15.0F, 3.0F, 13.88F, 3.0F, 12.5F)
          verticalLineToRelative(-9.0F)
          close()
          moveTo(5.5F, 2.0F)
          curveTo(4.672F, 2.0F, 4.0F, 2.672F, 4.0F, 3.5F)
          verticalLineToRelative(9.0F)
          curveTo(4.0F, 13.328F, 4.672F, 14.0F, 5.5F, 14.0F)
          horizontalLineToRelative(5.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          verticalLineToRelative(-9.0F)
          curveTo(12.0F, 2.672F, 11.328F, 2.0F, 10.5F, 2.0F)
          horizontalLineToRelative(-5.0F)
          close()
          moveTo(8.0F, 8.5F)
          curveToRelative(-0.828F, 0.0F, -1.5F, 0.672F, -1.5F, 1.5F)
          reflectiveCurveToRelative(0.672F, 1.5F, 1.5F, 1.5F)
          reflectiveCurveToRelative(1.5F, -0.672F, 1.5F, -1.5F)
          reflectiveCurveTo(8.828F, 8.5F, 8.0F, 8.5F)
          close()
          moveTo(5.5F, 10.0F)
          curveToRelative(0.0F, -1.38F, 1.12F, -2.5F, 2.5F, -2.5F)
          reflectiveCurveToRelative(2.5F, 1.12F, 2.5F, 2.5F)
          reflectiveCurveToRelative(-1.12F, 2.5F, -2.5F, 2.5F)
          reflectiveCurveToRelative(-2.5F, -1.12F, -2.5F, -2.5F)
          close()
          moveTo(8.0F, 6.0F)
          curveToRelative(0.552F, 0.0F, 1.0F, -0.448F, 1.0F, -1.0F)
          reflectiveCurveTo(8.552F, 4.0F, 8.0F, 4.0F)
          reflectiveCurveTo(7.0F, 4.448F, 7.0F, 5.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          close()        
      }
    }
    return _speakerBox16!!
  }

private var _speakerBox16: ImageVector? = null

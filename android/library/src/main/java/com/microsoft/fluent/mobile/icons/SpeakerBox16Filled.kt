package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SpeakerBox16: ImageVector
  get() {
    if (_speakerBox16 != null) {
      return _speakerBox16!!
    }
    _speakerBox16 = fluentIcon(name = "Filled.SpeakerBox16", 16f) {
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
          moveTo(9.0F, 5.0F)
          curveToRelative(0.0F, -0.552F, -0.448F, -1.0F, -1.0F, -1.0F)
          reflectiveCurveTo(7.0F, 4.448F, 7.0F, 5.0F)
          reflectiveCurveToRelative(0.448F, 1.0F, 1.0F, 1.0F)
          reflectiveCurveToRelative(1.0F, -0.448F, 1.0F, -1.0F)
          close()
          moveToRelative(-2.5F, 5.0F)
          curveToRelative(0.0F, -0.828F, 0.672F, -1.5F, 1.5F, -1.5F)
          reflectiveCurveTo(9.5F, 9.172F, 9.5F, 10.0F)
          reflectiveCurveTo(8.828F, 11.5F, 8.0F, 11.5F)
          reflectiveCurveTo(6.5F, 10.828F, 6.5F, 10.0F)
          close()
          moveTo(8.0F, 7.5F)
          curveToRelative(-1.38F, 0.0F, -2.5F, 1.12F, -2.5F, 2.5F)
          reflectiveCurveToRelative(1.12F, 2.5F, 2.5F, 2.5F)
          reflectiveCurveToRelative(2.5F, -1.12F, 2.5F, -2.5F)
          reflectiveCurveTo(9.38F, 7.5F, 8.0F, 7.5F)
          close()        
      }
    }
    return _speakerBox16!!
  }

private var _speakerBox16: ImageVector? = null

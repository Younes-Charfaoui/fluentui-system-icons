package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Filled.SpeakerBox24: ImageVector
  get() {
    if (_speakerBox24 != null) {
      return _speakerBox24!!
    }
    _speakerBox24 = fluentIcon(name = "Filled.SpeakerBox24", 24f) {
      materialPath {
          moveTo(4.0F, 5.25F)
          curveTo(4.0F, 3.455F, 5.455F, 2.0F, 7.25F, 2.0F)
          horizontalLineToRelative(9.5F)
          curveTo(18.545F, 2.0F, 20.0F, 3.455F, 20.0F, 5.25F)
          verticalLineToRelative(13.5F)
          curveToRelative(0.0F, 1.795F, -1.455F, 3.25F, -3.25F, 3.25F)
          horizontalLineToRelative(-9.5F)
          curveTo(5.455F, 22.0F, 4.0F, 20.545F, 4.0F, 18.75F)
          verticalLineTo(5.25F)
          close()
          moveToRelative(8.0F, 7.25F)
          curveToRelative(-1.105F, 0.0F, -2.0F, 0.895F, -2.0F, 2.0F)
          reflectiveCurveToRelative(0.895F, 2.0F, 2.0F, 2.0F)
          reflectiveCurveToRelative(2.0F, -0.895F, 2.0F, -2.0F)
          reflectiveCurveToRelative(-0.895F, -2.0F, -2.0F, -2.0F)
          close()
          moveToRelative(-3.5F, 2.0F)
          curveToRelative(0.0F, 1.933F, 1.567F, 3.5F, 3.5F, 3.5F)
          reflectiveCurveToRelative(3.5F, -1.567F, 3.5F, -3.5F)
          reflectiveCurveTo(13.933F, 11.0F, 12.0F, 11.0F)
          reflectiveCurveToRelative(-3.5F, 1.567F, -3.5F, 3.5F)
          close()
          moveTo(12.0F, 9.0F)
          curveToRelative(0.828F, 0.0F, 1.5F, -0.672F, 1.5F, -1.5F)
          reflectiveCurveTo(12.828F, 6.0F, 12.0F, 6.0F)
          reflectiveCurveToRelative(-1.5F, 0.672F, -1.5F, 1.5F)
          reflectiveCurveTo(11.172F, 9.0F, 12.0F, 9.0F)
          close()        
      }
    }
    return _speakerBox24!!
  }

private var _speakerBox24: ImageVector? = null

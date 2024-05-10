package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.ChatAdd24: ImageVector
  get() {
    if (_chatAdd24 != null) {
      return _chatAdd24!!
    }
    _chatAdd24 = fluentIcon(name = "Regular.ChatAdd24", 24f) {
      materialPath {
          moveTo(12.75F, 7.75F)
          curveTo(12.75F, 7.336F, 12.414F, 7.0F, 12.0F, 7.0F)
          reflectiveCurveToRelative(-0.75F, 0.336F, -0.75F, 0.75F)
          verticalLineToRelative(3.5F)
          horizontalLineToRelative(-3.5F)
          curveTo(7.336F, 11.25F, 7.0F, 11.586F, 7.0F, 12.0F)
          reflectiveCurveToRelative(0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(3.5F)
          verticalLineToRelative(3.5F)
          curveToRelative(0.0F, 0.414F, 0.336F, 0.75F, 0.75F, 0.75F)
          reflectiveCurveToRelative(0.75F, -0.336F, 0.75F, -0.75F)
          verticalLineToRelative(-3.5F)
          horizontalLineToRelative(3.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveToRelative(-0.336F, -0.75F, -0.75F, -0.75F)
          horizontalLineToRelative(-3.5F)
          verticalLineToRelative(-3.5F)
          close()
          moveTo(22.0F, 12.0F)
          curveToRelative(0.0F, -5.523F, -4.477F, -10.0F, -10.0F, -10.0F)
          reflectiveCurveTo(2.0F, 6.477F, 2.0F, 12.0F)
          curveToRelative(0.0F, 1.62F, 0.386F, 3.186F, 1.115F, 4.592F)
          lineToRelative(-1.068F, 3.823F)
          curveToRelative(-0.062F, 0.22F, -0.062F, 0.453F, 0.0F, 0.673F)
          curveToRelative(0.186F, 0.665F, 0.875F, 1.053F, 1.54F, 0.867F)
          lineToRelative(3.826F, -1.067F)
          curveTo(8.818F, 21.615F, 10.382F, 22.0F, 12.0F, 22.0F)
          curveToRelative(5.523F, 0.0F, 10.0F, -4.477F, 10.0F, -10.0F)
          close()
          moveTo(3.5F, 12.0F)
          curveToRelative(0.0F, -4.694F, 3.806F, -8.5F, 8.5F, -8.5F)
          reflectiveCurveToRelative(8.5F, 3.806F, 8.5F, 8.5F)
          reflectiveCurveToRelative(-3.806F, 8.5F, -8.5F, 8.5F)
          curveToRelative(-1.468F, 0.0F, -2.88F, -0.372F, -4.133F, -1.07F)
          lineToRelative(-0.27F, -0.15F)
          lineToRelative(-3.986F, 1.111F)
          lineToRelative(1.113F, -3.984F)
          lineToRelative(-0.151F, -0.27F)
          curveTo(3.873F, 14.883F, 3.5F, 13.47F, 3.5F, 12.0F)
          close()        
      }
    }
    return _chatAdd24!!
  }

private var _chatAdd24: ImageVector? = null

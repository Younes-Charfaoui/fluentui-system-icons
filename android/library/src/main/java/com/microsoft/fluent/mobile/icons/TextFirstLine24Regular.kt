package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.TextFirstLine24: ImageVector
  get() {
    if (_textFirstLine24 != null) {
      return _textFirstLine24!!
    }
    _textFirstLine24 = fluentIcon(name = "Regular.TextFirstLine24", 24f) {
      materialPath {
          moveTo(3.78F, 3.22F)
          curveToRelative(-0.293F, -0.293F, -0.767F, -0.293F, -1.06F, 0.0F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          lineToRelative(1.47F, 1.47F)
          lineToRelative(-1.47F, 1.47F)
          curveToRelative(-0.293F, 0.293F, -0.293F, 0.767F, 0.0F, 1.06F)
          curveToRelative(0.293F, 0.293F, 0.767F, 0.293F, 1.06F, 0.0F)
          lineToRelative(2.0F, -2.0F)
          curveToRelative(0.293F, -0.293F, 0.293F, -0.767F, 0.0F, -1.06F)
          lineToRelative(-2.0F, -2.0F)
          close()
          moveTo(9.75F, 5.0F)
          curveTo(9.336F, 5.0F, 9.0F, 5.336F, 9.0F, 5.75F)
          reflectiveCurveTo(9.336F, 6.5F, 9.75F, 6.5F)
          horizontalLineToRelative(11.5F)
          curveTo(21.664F, 6.5F, 22.0F, 6.164F, 22.0F, 5.75F)
          reflectiveCurveTo(21.664F, 5.0F, 21.25F, 5.0F)
          horizontalLineTo(9.75F)
          close()
          moveToRelative(-7.0F, 13.0F)
          curveTo(2.336F, 18.0F, 2.0F, 18.336F, 2.0F, 18.75F)
          reflectiveCurveToRelative(0.336F, 0.75F, 0.75F, 0.75F)
          horizontalLineToRelative(18.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, -0.336F, 0.75F, -0.75F)
          reflectiveCurveTo(21.664F, 18.0F, 21.25F, 18.0F)
          horizontalLineTo(2.75F)
          close()
          moveTo(2.0F, 12.25F)
          curveToRelative(0.0F, -0.414F, 0.336F, -0.75F, 0.75F, -0.75F)
          horizontalLineToRelative(18.5F)
          curveToRelative(0.414F, 0.0F, 0.75F, 0.336F, 0.75F, 0.75F)
          reflectiveCurveTo(21.664F, 13.0F, 21.25F, 13.0F)
          horizontalLineTo(2.75F)
          curveTo(2.336F, 13.0F, 2.0F, 12.664F, 2.0F, 12.25F)
          close()        
      }
    }
    return _textFirstLine24!!
  }

private var _textFirstLine24: ImageVector? = null

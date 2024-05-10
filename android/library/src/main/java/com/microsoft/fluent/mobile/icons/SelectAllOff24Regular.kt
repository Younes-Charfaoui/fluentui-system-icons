package com.microsoft.fluent.mobile.icons

import androidx.compose.material.icons.materialPath
import androidx.compose.ui.graphics.vector.ImageVector
import com.microsoft.fluent.mobile.FluentIcons
import com.microsoft.fluent.mobile.fluentIcon

public val FluentIcons.Regular.SelectAllOff24: ImageVector
  get() {
    if (_selectAllOff24 != null) {
      return _selectAllOff24!!
    }
    _selectAllOff24 = fluentIcon(name = "Regular.SelectAllOff24", 24f) {
      materialPath {
          moveTo(6.25F, 3.0F)
          curveTo(4.455F, 3.0F, 3.0F, 4.455F, 3.0F, 6.25F)
          verticalLineToRelative(9.0F)
          curveToRelative(0.0F, 1.795F, 1.455F, 3.25F, 3.25F, 3.25F)
          horizontalLineToRelative(9.0F)
          curveToRelative(1.795F, 0.0F, 3.25F, -1.455F, 3.25F, -3.25F)
          verticalLineToRelative(-9.0F)
          curveTo(18.5F, 4.455F, 17.045F, 3.0F, 15.25F, 3.0F)
          horizontalLineToRelative(-9.0F)
          close()
          moveTo(4.5F, 6.25F)
          curveToRelative(0.0F, -0.966F, 0.784F, -1.75F, 1.75F, -1.75F)
          horizontalLineToRelative(9.0F)
          curveTo(16.216F, 4.5F, 17.0F, 5.284F, 17.0F, 6.25F)
          verticalLineToRelative(9.0F)
          curveToRelative(0.0F, 0.966F, -0.784F, 1.75F, -1.75F, 1.75F)
          horizontalLineToRelative(-9.0F)
          curveToRelative(-0.966F, 0.0F, -1.75F, -0.784F, -1.75F, -1.75F)
          verticalLineToRelative(-9.0F)
          close()
          moveTo(6.01F, 19.5F)
          curveTo(6.589F, 20.402F, 7.6F, 21.0F, 8.75F, 21.0F)
          horizontalLineToRelative(7.0F)
          curveToRelative(2.9F, 0.0F, 5.25F, -2.35F, 5.25F, -5.25F)
          verticalLineToRelative(-7.0F)
          curveToRelative(0.0F, -1.15F, -0.598F, -2.161F, -1.5F, -2.739F)
          verticalLineToRelative(9.74F)
          curveToRelative(0.0F, 2.07F, -1.679F, 3.75F, -3.75F, 3.75F)
          horizontalLineToRelative(-7.0F)
          lineTo(8.724F, 19.5F)
          horizontalLineTo(6.011F)
          close()        
      }
    }
    return _selectAllOff24!!
  }

private var _selectAllOff24: ImageVector? = null

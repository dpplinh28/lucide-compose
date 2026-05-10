package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("EvCharger") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(14f, 13f)
                horizontalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, true, 2f, 2f)
                verticalLineToRelative(2f)
                arcToRelative(2f, 2f, 0f, false, false, 4f, 0f)
                verticalLineToRelative(-6.998f)
                arcToRelative(2f, 2f, 0f, false, false, -.59f, -1.42f)
                lineTo(18f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 21f)
                verticalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(5f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                verticalLineToRelative(16f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 21f)
                horizontalLineToRelative(13f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 7f)
                horizontalLineToRelative(11f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(9f, 11f)
                lineToRelative(-2f, 3f)
                horizontalLineToRelative(3f)
                lineToRelative(-2f, 3f)
            }
}

public val LucideIcons.All.EvChargerDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.EvCharger: ImageVector
    @Composable get() = EvChargerDefinition.asImageVector()

package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("RollerCoaster") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(6f, 19f)
                verticalLineTo(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(10f, 19f)
                verticalLineTo(6.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 19f)
                verticalLineToRelative(-7.8f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 5f)
                verticalLineToRelative(4f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 19f)
                verticalLineToRelative(-6f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 19f)
                verticalLineTo(9f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 19f)
                verticalLineTo(9f)
                arcToRelative(4f, 4f, 0f, false, true, 4f, -4f)
                curveToRelative(2f, 0f, 4f, 1.33f, 6f, 4f)
                reflectiveCurveToRelative(4f, 4f, 6f, 4f)
                arcToRelative(4f, 4f, 0f, true, false, -3f, -6.65f)
            }
}

public val LucideIcons.All.RollerCoasterDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.RollerCoaster: ImageVector
    @Composable get() = RollerCoasterDefinition.asImageVector()

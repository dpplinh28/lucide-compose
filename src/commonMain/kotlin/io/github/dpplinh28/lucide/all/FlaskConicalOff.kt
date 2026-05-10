package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("FlaskConicalOff") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(10f, 2f)
                verticalLineToRelative(2.343f)
            }
            lucidePath(strokeWidth) {
                moveTo(14f, 2f)
                verticalLineToRelative(6.343f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(2f, 2f)
                lineToRelative(20f, 20f)
            }
            lucidePath(strokeWidth) {
                moveTo(20f, 20f)
                arcToRelative(2f, 2f, 0f, false, true, -2f, 2f)
                horizontalLineTo(6f)
                arcToRelative(2f, 2f, 0f, false, true, -1.755f, -2.96f)
                lineToRelative(5.227f, -9.563f)
            }
            lucidePath(strokeWidth) {
                moveTo(6.453f, 15f)
                horizontalLineTo(15f)
            }
            lucidePath(strokeWidth) {
                moveTo(8.5f, 2f)
                horizontalLineToRelative(7f)
            }
}

public val LucideIcons.All.FlaskConicalOffDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.FlaskConicalOff: ImageVector
    @Composable get() = FlaskConicalOffDefinition.asImageVector()

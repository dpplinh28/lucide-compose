package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Cigarette") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17f, 12f)
                horizontalLineTo(3f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(14f)
            }
            lucidePath(strokeWidth) {
                moveTo(18f, 8f)
                curveToRelative(0f, -2.5f, -2f, -2.5f, -2f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 16f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
            }
            lucidePath(strokeWidth) {
                moveTo(22f, 8f)
                curveToRelative(0f, -2.5f, -2f, -2.5f, -2f, -5f)
            }
            lucidePath(strokeWidth) {
                moveTo(7f, 12f)
                verticalLineToRelative(4f)
            }
}

public val LucideIcons.All.CigaretteDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Cigarette: ImageVector
    @Composable get() = CigaretteDefinition.asImageVector()

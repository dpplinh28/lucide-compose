package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Siren") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(7f, 18f)
                verticalLineToRelative(-6f)
                arcToRelative(5f, 5f, 0f, true, true, 10f, 0f)
                verticalLineToRelative(6f)
            }
            lucidePath(strokeWidth) {
                moveTo(5f, 21f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(12f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-1f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, -2f)
                horizontalLineTo(7f)
                arcToRelative(2f, 2f, 0f, false, false, -2f, 2f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(21f, 12f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.5f, 4.5f)
                lineTo(18f, 5f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 12f)
                horizontalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 2f)
                verticalLineToRelative(1f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(4.929f, 4.929f)
                lineToRelative(.707f, .707f)
            }
            lucidePath(strokeWidth) {
                moveTo(12f, 12f)
                verticalLineToRelative(6f)
            }
}

public val LucideIcons.All.SirenDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Siren: ImageVector
    @Composable get() = SirenDefinition.asImageVector()

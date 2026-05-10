package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Sheet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(5.0f, 3.0f)
                horizontalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-14.0f)
                arcToRelative(2.0f, 2.0f, 0f, false, true, 2.0f, -2.0f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 9f)
                lineTo(21f, 9f)
            }
            lucidePath(strokeWidth) {
                moveTo(3f, 15f)
                lineTo(21f, 15f)
            }
            lucidePath(strokeWidth) {
                moveTo(9f, 9f)
                lineTo(9f, 21f)
            }
            lucidePath(strokeWidth) {
                moveTo(15f, 9f)
                lineTo(15f, 21f)
            }
}

public val LucideIcons.All.SheetDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Sheet: ImageVector
    @Composable get() = SheetDefinition.asImageVector()

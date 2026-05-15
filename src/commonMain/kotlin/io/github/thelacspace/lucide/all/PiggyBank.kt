package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("PiggyBank") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(11f, 17f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-3f)
                arcToRelative(3.16f, 3.16f, 0f, false, false, 2f, -2f)
                horizontalLineToRelative(1f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                verticalLineToRelative(-2f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-1f)
                arcToRelative(5f, 5f, 0f, false, false, -2f, -4f)
                verticalLineTo(3f)
                arcToRelative(4f, 4f, 0f, false, false, -3.2f, 1.6f)
                lineToRelative(-.3f, .4f)
                horizontalLineTo(11f)
                arcToRelative(6f, 6f, 0f, false, false, -6f, 6f)
                verticalLineToRelative(1f)
                arcToRelative(5f, 5f, 0f, false, false, 2f, 4f)
                verticalLineToRelative(3f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, 1f)
                horizontalLineToRelative(2f)
                arcToRelative(1f, 1f, 0f, false, false, 1f, -1f)
                close()
            }
            lucidePath(strokeWidth) {
                moveTo(16f, 10f)
                horizontalLineToRelative(.01f)
            }
            lucidePath(strokeWidth) {
                moveTo(2f, 8f)
                verticalLineToRelative(1f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(1f)
            }
}

public val LucideIcons.All.PiggyBankDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.PiggyBank: ImageVector
    @Composable get() = PiggyBankDefinition.asImageVector()

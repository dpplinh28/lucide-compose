package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Dumbbell") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(17.596f, 12.768f)
                arcToRelative(2f, 2f, 0f, true, false, 2.829f, -2.829f)
                lineToRelative(-1.768f, -1.767f)
                arcToRelative(2f, 2f, 0f, false, false, 2.828f, -2.829f)
                lineToRelative(-2.828f, -2.828f)
                arcToRelative(2f, 2f, 0f, false, false, -2.829f, 2.828f)
                lineToRelative(-1.767f, -1.768f)
                arcToRelative(2f, 2f, 0f, true, false, -2.829f, 2.829f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(2.5f, 21.5f)
                lineToRelative(1.4f, -1.4f)
            }
            lucidePath(strokeWidth) {
                moveToRelative(20.1f, 3.9f)
                lineToRelative(1.4f, -1.4f)
            }
            lucidePath(strokeWidth) {
                moveTo(5.343f, 21.485f)
                arcToRelative(2f, 2f, 0f, true, false, 2.829f, -2.828f)
                lineToRelative(1.767f, 1.768f)
                arcToRelative(2f, 2f, 0f, true, false, 2.829f, -2.829f)
                lineToRelative(-6.364f, -6.364f)
                arcToRelative(2f, 2f, 0f, true, false, -2.829f, 2.829f)
                lineToRelative(1.768f, 1.767f)
                arcToRelative(2f, 2f, 0f, false, false, -2.828f, 2.829f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(9.6f, 14.4f)
                lineToRelative(4.8f, -4.8f)
            }
}

public val LucideIcons.All.DumbbellDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Dumbbell: ImageVector
    @Composable get() = DumbbellDefinition.asImageVector()

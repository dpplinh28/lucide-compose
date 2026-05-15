package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Magnet") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(12f, 15f)
                lineToRelative(4f, 4f)
            }
            lucidePath(strokeWidth) {
                moveTo(2.352f, 10.648f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 0f, 1.704f)
                lineToRelative(2.296f, 2.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 1.704f, 0f)
                lineToRelative(6.029f, -6.029f)
                arcToRelative(1f, 1f, 0f, true, true, 3f, 3f)
                lineToRelative(-6.029f, 6.029f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 0f, 1.704f)
                lineToRelative(2.296f, 2.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 1.704f, 0f)
                lineToRelative(6.365f, -6.367f)
                arcTo(1f, 1f, 0f, false, false, 8.716f, 4.282f)
                close()
            }
            lucidePath(strokeWidth) {
                moveToRelative(5f, 8f)
                lineToRelative(4f, 4f)
            }
}

public val LucideIcons.All.MagnetDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Magnet: ImageVector
    @Composable get() = MagnetDefinition.asImageVector()

package io.github.thelacspace.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.thelacspace.lucide.LucideIcons
import io.github.thelacspace.lucide.LucideIconDefinition
import io.github.thelacspace.lucide.asImageVector
import io.github.thelacspace.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Store") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveTo(15f, 21f)
                verticalLineToRelative(-5f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, -1f)
                horizontalLineToRelative(-4f)
                arcToRelative(1f, 1f, 0f, false, false, -1f, 1f)
                verticalLineToRelative(5f)
            }
            lucidePath(strokeWidth) {
                moveTo(17.774f, 10.31f)
                arcToRelative(1.12f, 1.12f, 0f, false, false, -1.549f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.451f, 0f)
                arcToRelative(1.12f, 1.12f, 0f, false, false, -1.548f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.452f, 0f)
                arcToRelative(1.12f, 1.12f, 0f, false, false, -1.549f, 0f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.77f, -3.248f)
                lineToRelative(2.889f, -4.184f)
                arcTo(2f, 2f, 0f, false, true, 7f, 2f)
                horizontalLineToRelative(10f)
                arcToRelative(2f, 2f, 0f, false, true, 1.653f, .873f)
                lineToRelative(2.895f, 4.192f)
                arcToRelative(2.5f, 2.5f, 0f, false, true, -3.774f, 3.244f)
            }
            lucidePath(strokeWidth) {
                moveTo(4f, 10.95f)
                verticalLineTo(19f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, 2f)
                horizontalLineToRelative(12f)
                arcToRelative(2f, 2f, 0f, false, false, 2f, -2f)
                verticalLineToRelative(-8.05f)
            }
}

public val LucideIcons.All.StoreDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Store: ImageVector
    @Composable get() = StoreDefinition.asImageVector()

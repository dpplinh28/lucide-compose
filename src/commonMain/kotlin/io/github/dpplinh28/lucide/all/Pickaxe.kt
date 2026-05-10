package io.github.dpplinh28.lucide.all

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import io.github.dpplinh28.lucide.LucideIcons
import io.github.dpplinh28.lucide.LucideIconDefinition
import io.github.dpplinh28.lucide.asImageVector
import io.github.dpplinh28.lucide.lucidePath

private val _ActivityDefinition = LucideIconDefinition("Pickaxe") { strokeWidth ->
    lucidePath(strokeWidth) {
                moveToRelative(14f, 13f)
                lineToRelative(-8.381f, 8.38f)
                arcToRelative(1f, 1f, 0f, false, true, -3.001f, -3f)
                lineTo(11f, 9.999f)
            }
            lucidePath(strokeWidth) {
                moveTo(15.973f, 4.027f)
                arcTo(13f, 13f, 0f, false, false, 5.902f, 2.373f)
                curveToRelative(-1.398f, .342f, -1.092f, 2.158f, .277f, 2.601f)
                arcToRelative(19.9f, 19.9f, 0f, false, true, 5.822f, 3.024f)
            }
            lucidePath(strokeWidth) {
                moveTo(16.001f, 11.999f)
                arcToRelative(19.9f, 19.9f, 0f, false, true, 3.024f, 5.824f)
                curveToRelative(.444f, 1.369f, 2.26f, 1.676f, 2.603f, .278f)
                arcTo(13f, 13f, 0f, false, false, 20f, 8.069f)
            }
            lucidePath(strokeWidth) {
                moveTo(18.352f, 3.352f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, -1.704f, 0f)
                lineToRelative(-5.296f, 5.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 0f, 1.704f)
                lineToRelative(2.296f, 2.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 1.704f, 0f)
                lineToRelative(5.296f, -5.296f)
                arcToRelative(1.205f, 1.205f, 0f, false, false, 0f, -1.704f)
                close()
            }
}

public val LucideIcons.All.PickaxeDefinition: LucideIconDefinition
    get() = _ActivityDefinition

public val LucideIcons.All.Pickaxe: ImageVector
    @Composable get() = PickaxeDefinition.asImageVector()
